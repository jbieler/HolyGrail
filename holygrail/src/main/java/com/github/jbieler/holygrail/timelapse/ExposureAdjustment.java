package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camsettings.CameraSettings;

/**
 * Exposure adjustment that can use any combinations of <code>CameraSettings</code> to make images darker or lighter.
 */
public interface ExposureAdjustment {

    /**
     * Adjust exposure by one step that results in a darker image
     *
     * @param cameraSettings former camera settings
     * @return adjusted camera settings
     */
    public CameraSettings darker(CameraSettings cameraSettings);

    /**
     * Adjust exposure by one step that results in a lighter image
     *
     * @param cameraSettings former camera settings
     * @return adjusted camera settings
     */
    public CameraSettings lighter(CameraSettings cameraSettings);
}
