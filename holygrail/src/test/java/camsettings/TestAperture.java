package camsettings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAperture {

    @Test
    public void testAperture() {
        Aperture fTwoPointEight = Aperture.of(2.8);
        assertEquals("f2.8", fTwoPointEight.toString());
    }
}
