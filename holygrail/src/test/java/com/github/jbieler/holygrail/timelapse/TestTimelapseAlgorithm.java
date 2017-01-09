package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camera.Camera;
import com.github.jbieler.holygrail.exposure.ExposureCalculation;
import com.github.jbieler.holygrail.exposure.LuminanceExposureCalculation;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestTimelapseAlgorithm {

    @Test
    public void testTimelapseAlgorithm() throws IOException {
        Camera camera = mock(Camera.class);
        ExposureCalculation exposureCalculation = mock(ExposureCalculation.class);
        ExposureAdjustment exposureAdjustment = mock(ExposureAdjustment.class);

        when(camera.lastTakenImage()).thenReturn(testImage());

        TimelapseAlgorithm timelapseAlgorithm = new TimelapseAlgorithm(camera, exposureCalculation, exposureAdjustment);
        timelapseAlgorithm.trackExposure();


    }

    private BufferedImage testImage() throws IOException {
        File f = new File("/image.jpg");
        return ImageIO.read(f);
    }
}
