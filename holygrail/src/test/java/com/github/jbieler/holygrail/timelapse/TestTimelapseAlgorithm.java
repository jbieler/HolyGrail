package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camera.Camera;
import com.github.jbieler.holygrail.camsettings.CameraSettings;
import com.github.jbieler.holygrail.exposure.ExposureCalculation;
import com.github.jbieler.holygrail.exposure.MockExposure;
import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class TestTimelapseAlgorithm {

    @Test
    public void testTimelapseAlgorithm() throws IOException {
        Camera camera = mock(Camera.class);
        ExposureCalculation exposureCalculation = MockExposure.newIncrementingExposure(0.3, 0.06);
        ExposureAdjustment exposureAdjustment = mock(ExposureAdjustment.class);

        TimelapseAlgorithm timelapseAlgorithm = new TimelapseAlgorithm(camera, exposureCalculation, exposureAdjustment);
        timelapseAlgorithm.calculateBaselineExposure();

        timelapseAlgorithm.trackExposure();

        verify(camera).adjustCameraSettings(any(CameraSettings.class));

        timelapseAlgorithm.trackExposure();

        verify(exposureAdjustment).darker(any(CameraSettings.class));
        verify(camera, times(2)).adjustCameraSettings(any(CameraSettings.class));
    }
}
