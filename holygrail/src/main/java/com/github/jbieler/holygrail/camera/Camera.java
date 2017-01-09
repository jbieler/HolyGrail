package com.github.jbieler.holygrail.camera;

import com.github.jbieler.holygrail.camsettings.CameraSettings;

import java.awt.image.BufferedImage;

public interface Camera {

    /**
     * Grab the last image that was shot
     *
     * @return the last image that was shot
     */
    public BufferedImage lastTakenImage();

    /**
     * Grab the current camera settings
     *
     * @return the current camera settings
     */
    public CameraSettings cameraSettings();

    /**
     * Adjust the camera settings to <code>cameraSettings</code>
     *
     * @param cameraSettings the new camera settings
     */
    public void adjustCameraSettings(CameraSettings cameraSettings);
}
