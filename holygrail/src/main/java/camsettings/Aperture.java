package camsettings;

public class Aperture {

    public static final Aperture f2 = Aperture.of(2.0);
    public static final Aperture f28 = Aperture.of(2.8);
    public static final Aperture f35 = Aperture.of(3.5);

    private final double value;

    private Aperture(double value) {
        this.value = value;
    }

    public static Aperture of(double value) {
        double rounded = Math.round(value * 10) / 10.0d;
        return new Aperture(rounded);
    }

    public String toString() {
        return "f" + value;
    }

}
