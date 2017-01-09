package com.github.jbieler.holygrail.camsettings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShutterSpeed {

    @Test
    public void testShutterSpeedOneSec() {
        ShutterSpeed oneSecond = ShutterSpeed.fromSeconds(1.0);
        assertEquals("1.0 s", oneSecond.toString());
    }

    @Test
    public void testShutterSpeedOneTenthSec() {
        ShutterSpeed oneTenthSecond = ShutterSpeed.fromSeconds(0.1);
        assertEquals("0.1 s", oneTenthSecond.toString());
    }
}
