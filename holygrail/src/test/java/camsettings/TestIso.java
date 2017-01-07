package camsettings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestIso {

    @Test
    public void testIso() {
        Iso iso100 = Iso.of(100);
        assertEquals("ISO 100", iso100.toString());
    }
}
