package com.github.jbieler.holygrail.exposure;

import java.awt.image.BufferedImage;

public class MockExposure implements ExposureCalculation {

    private double currentExposure;
    private final double increment;
    private final double decrement;

    private MockExposure(double startExposure, double increment, double decrement) {
        currentExposure = startExposure;
        this.increment = increment;
        this.decrement = decrement;
    }

    public double exposureOf(BufferedImage image) {
        double ce = currentExposure;
        currentExposure = currentExposure + increment - decrement;
        return ce;
    }

    public static MockExposure newIncrementingExposure(double startExposure, double increment) {
        return new MockExposure(startExposure, increment, 0);
    }

    public static MockExposure newDecrementingExposure(double startExposure, double decrement) {
        return new MockExposure(startExposure, 0, decrement);
    }
}
