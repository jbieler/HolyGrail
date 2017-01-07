package camsettings;

public class CameraSettings {

    public final Aperture aperture;
    public final ShutterSpeed shutterSpeed;
    public final Iso iso;

    private CameraSettings(Aperture aperture, ShutterSpeed shutterSpeed, Iso iso) {
        this.aperture = aperture;
        this.shutterSpeed = shutterSpeed;
        this.iso = iso;
    }

    public static CameraSettings of(Aperture aperture, ShutterSpeed shutterSpeed, Iso iso) {
        return new CameraSettings(aperture, shutterSpeed, iso);
    }
}
