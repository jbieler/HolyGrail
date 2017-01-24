package com.github.jbieler.holygrail.exposuredelta;

import com.github.jbieler.holygrail.exposure.ExposureCalculation;
import com.github.jbieler.holygrail.exposure.LuminanceExposureCalculation;
import org.junit.Ignore;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestExposureDelta {

    @Test
    public void testExposureDelta() throws IOException {
        String[] filenames = new String[]{"000.jpg", "001.jpg", "002.jpg", "003.jpg", "004.jpg", "005.jpg",
                "006.jpg", "007.jpg", "008.jpg", "009.jpg", "010.jpg", "011.jpg", "012.jpg"};

        List<Double> exposures = new ArrayList<Double>();
        ExposureCalculation exposureCalculation = new LuminanceExposureCalculation();

        for (String fname : filenames) {
            exposures.add(exposureCalculation.exposureOf(testImage("exposure-ranges/scene-3/" + fname)));
        }

        System.out.println("Exposures: " + exposures);

        for (int i = 0; i < exposures.size() - 1; i++) {
            System.out.println(exposures.get(i) - exposures.get(i + 1));
        }
    }

    private BufferedImage testImage(String imageName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(imageName).getFile());
        return ImageIO.read(file);
    }
}
