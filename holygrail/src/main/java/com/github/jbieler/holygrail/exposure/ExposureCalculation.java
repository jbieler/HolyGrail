package com.github.jbieler.holygrail.exposure;

import java.awt.image.BufferedImage;

/**
 * Calculates the exposure for a given image
 */
public interface ExposureCalculation {

    /**
     * Calculates the exposure of <code>image</code> represented by a <code>double</code> value with following properties.
     * - value < 0, if the image is too dark
     * - value > 0, if the image is too bright
     * - value = 0, if the image is correctly exposed
     *
     * @param image the image to calculate the exposure for
     * @return the exposure value
     */
    public double exposureOf(BufferedImage image);
}
