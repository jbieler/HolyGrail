package com.github.jbieler.holygrail.camsettings;

public class ShutterSpeed {

    public static final ShutterSpeed s1 = ShutterSpeed.fromSeconds(1);

    private final double valueInSeconds;

    private ShutterSpeed(double value) {
        this.valueInSeconds = value;
    }

    public static ShutterSpeed fromSeconds(double value) {
        return new ShutterSpeed(value);
    }

    public static ShutterSpeed fromMilliSeconds(double value) {
        return new ShutterSpeed(value / 1000);
    }

    public double inSeconds() {
        return valueInSeconds;
    }

    public String toString() {
        return valueInSeconds + " s";
    }
}
