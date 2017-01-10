package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camera.Camera;
import com.github.jbieler.holygrail.camsettings.CameraSettings;
import com.github.jbieler.holygrail.exposure.ExposureCalculation;
import com.github.jbieler.holygrail.exposure.LuminanceExposureCalculation;
import org.junit.Test;
import org.mockito.stubbing.Answer;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class TestTimelapseAlgorithm {

    @Test
    public void testTimelapseAlgorithm() throws IOException {
        Camera camera = mock(Camera.class);
        ExposureCalculation exposureCalculation = mock(ExposureCalculation.class);
        ExposureAdjustment exposureAdjustment = mock(ExposureAdjustment.class);
        BufferedImage image = mock(BufferedImage.class);
        CameraSettings cameraSettings = mock(CameraSettings.class);

        when(camera.lastTakenImage()).thenReturn(image);
        when(camera.cameraSettings()).thenReturn(cameraSettings);

        TimelapseAlgorithm timelapseAlgorithm = new TimelapseAlgorithm(camera, exposureCalculation, exposureAdjustment);
        timelapseAlgorithm.trackExposure();

        //verify(exposureAdjustment, times(1)).darker(  );


    }

}
