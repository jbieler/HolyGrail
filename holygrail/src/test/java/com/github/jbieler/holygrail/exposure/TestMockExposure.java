package com.github.jbieler.holygrail.exposure;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestMockExposure {

    @Test
    public void testIncrementingMockExposure() {
        MockExposure exposure = MockExposure.newIncrementingExposure(0.2, 0.01);
        assertEquals(0.2, exposure.exposureOf(null), 0.00001);
        assertEquals(0.21, exposure.exposureOf(null), 0.00001);
        assertEquals(0.22, exposure.exposureOf(null), 0.00001);
        assertEquals(0.23, exposure.exposureOf(null), 0.00001);
    }


    @Test
    public void testDecrementingMockExposure() {
        MockExposure exposure = MockExposure.newDecrementingExposure(0.8, 0.02);
        assertEquals(0.8, exposure.exposureOf(null), 0.00001);
        assertEquals(0.78, exposure.exposureOf(null), 0.00001);
        assertEquals(0.76, exposure.exposureOf(null), 0.00001);
        assertEquals(0.74, exposure.exposureOf(null), 0.00001);
    }
}
