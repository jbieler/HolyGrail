package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camsettings.CameraSettings;

public class NoExposureAdjustment implements ExposureAdjustment {

    public CameraSettings darker(CameraSettings cameraSettings) {
        return cameraSettings;
    }

    public CameraSettings lighter(CameraSettings cameraSettings) {
        return cameraSettings;
    }
}
