package com.github.jbieler.holygrail.exposure;

import java.awt.image.BufferedImage;

/**
 * Calculates the exposure for a given image
 */
public interface ExposureCalculation {

    /**
     * Calculates the exposure of <code>image</code> represented by a <code>double</code> value with following properties.
     * - 0 <= value <= 1, for any image
     * - value = 0, if the image is black
     * - value = 1, if the image is white
     *
     * @param image the image to calculate the exposure for
     * @return the exposure value
     */
    public double exposureOf(BufferedImage image);
}
