package com.github.jbieler.holygrail.camsettings;

public class CameraSettings {

    public final Aperture aperture;
    public final ShutterSpeed shutterSpeed;
    public final Iso iso;

    private CameraSettings(Aperture aperture, ShutterSpeed shutterSpeed, Iso iso) {
        this.aperture = aperture;
        this.shutterSpeed = shutterSpeed;
        this.iso = iso;
    }

    public CameraSettings with(Aperture aperture) {
        return new CameraSettings(aperture, this.shutterSpeed, this.iso);
    }

    public CameraSettings with(ShutterSpeed shutterSpeed) {
        return new CameraSettings(this.aperture, shutterSpeed, this.iso);
    }

    public CameraSettings with(Iso iso) {
        return new CameraSettings(this.aperture, this.shutterSpeed, iso);
    }

    public static CameraSettings of(Aperture aperture, ShutterSpeed shutterSpeed, Iso iso) {
        return new CameraSettings(aperture, shutterSpeed, iso);
    }
}
