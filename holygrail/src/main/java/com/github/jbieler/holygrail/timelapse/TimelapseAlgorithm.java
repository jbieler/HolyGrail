package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camera.Camera;
import com.github.jbieler.holygrail.camsettings.CameraSettings;
import com.github.jbieler.holygrail.exposure.ExposureCalculation;

import java.awt.image.BufferedImage;

public class TimelapseAlgorithm {

    private ExposureCalculation exposureCalculation;
    private ExposureAdjustment exposureAdjustment;
    private Camera camera;

    public TimelapseAlgorithm(Camera camera, ExposureCalculation exposureCalculation,
                              ExposureAdjustment exposureAdjustment) {

        this.camera = camera;
        this.exposureCalculation = exposureCalculation;
        this.exposureAdjustment = exposureAdjustment;

    }

    public void trackExposure() {
        BufferedImage lastImage = camera.lastTakenImage();
        CameraSettings currenSettings = camera.cameraSettings();
        double exposure = exposureCalculation.exposureOf(lastImage);
        CameraSettings adjustedSettings;

        if (exposure < 0) {
            adjustedSettings = exposureAdjustment.lighter(currenSettings);
        } else if (exposure > 0) {
            adjustedSettings = exposureAdjustment.darker(currenSettings);
        } else {
            adjustedSettings = currenSettings;
        }

        camera.adjustCameraSettings(adjustedSettings);
    }
}
