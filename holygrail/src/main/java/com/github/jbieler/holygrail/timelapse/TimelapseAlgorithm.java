package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camera.Camera;
import com.github.jbieler.holygrail.camsettings.CameraSettings;
import com.github.jbieler.holygrail.exposure.ExposureCalculation;

import java.awt.image.BufferedImage;

public class TimelapseAlgorithm {

    private ExposureCalculation exposureCalculation;
    private ExposureAdjustment exposureAdjustment;
    private Camera camera;

    private double baselineExposure;
    private static final double EPSILON = 0.1;

    public TimelapseAlgorithm(Camera camera, ExposureCalculation exposureCalculation,
                              ExposureAdjustment exposureAdjustment) {

        this.camera = camera;
        this.exposureCalculation = exposureCalculation;
        this.exposureAdjustment = exposureAdjustment;

    }

    public void calculateBaselineExposure() {
        baselineExposure = exposureOfLastImage();
    }

    public void trackExposure() {

        CameraSettings currentSettings = camera.cameraSettings();
        CameraSettings adjustedSettings;

        double exposure = exposureOfLastImage();
        double exposureDelta = exposure - baselineExposure;

        if (exposureDelta > EPSILON) {
            adjustedSettings = exposureAdjustment.darker(currentSettings);
        } else if (exposureDelta < -EPSILON) {
            adjustedSettings = exposureAdjustment.lighter(currentSettings);
        } else {
            adjustedSettings = currentSettings;
        }

        camera.adjustCameraSettings(adjustedSettings);
    }

    private double exposureOfLastImage() {
        BufferedImage lastImage = camera.lastTakenImage();
        return exposureCalculation.exposureOf(lastImage);
    }
}
