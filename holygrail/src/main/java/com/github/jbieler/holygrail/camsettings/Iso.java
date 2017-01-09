package com.github.jbieler.holygrail.camsettings;

public class Iso {

    public static final Iso iso100 = Iso.of(100);
    public static final Iso iso200 = Iso.of(200);
    public static final Iso iso400 = Iso.of(400);

    private final int value;

    private Iso(int value) {
        this.value = value;
    }

    public static Iso of(int value) {
        return new Iso(value);
    }

    public String toString() {
        return "ISO " + value;
    }

}
