package com.github.jbieler.holygrail.exposure;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class LuminanceExposureCalculation implements ExposureCalculation {
    public double exposureOf(BufferedImage image) {

        ArrayList<Float> luminances = new ArrayList<Float>();

        for (int i = 0; i < image.getWidth(); i++) {

            for (int j = 0; j < image.getHeight(); j++) {

                int color = image.getRGB(i, j);

                // extract each color component
                int red = (color >>> 16) & 0xFF;
                int green = (color >>> 8) & 0xFF;
                int blue = (color >>> 0) & 0xFF;

                // calc luminance in range 0.0 to 1.0; using SRGB luminance constants
                float luminance = (red * 0.2126f + green * 0.7152f + blue * 0.0722f) / 255;

                luminances.add(luminance);
            }
        }

        return mean(luminances.toArray(new Float[]{}));
    }

    public static double mean(Float[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }
}
