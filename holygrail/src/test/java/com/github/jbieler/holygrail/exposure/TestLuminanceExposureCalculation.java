package com.github.jbieler.holygrail.exposure;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertTrue;

public class TestLuminanceExposureCalculation {

    @Test
    public void TestLuminanceExposureCalculation() throws IOException {
        ExposureCalculation exposure = new LuminanceExposureCalculation();
        double exposureValue = exposure.exposureOf(testImage());
        assertTrue(exposureValue > -1);
        assertTrue(exposureValue < 1);
    }

    private BufferedImage testImage() throws IOException {
        File f = new File("/image.jpg");
        return ImageIO.read(f);
    }
}
