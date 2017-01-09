package com.github.jbieler.holygrail.timelapse;

import com.github.jbieler.holygrail.camsettings.Aperture;
import com.github.jbieler.holygrail.camsettings.Iso;
import com.github.jbieler.holygrail.camsettings.ShutterSpeed;

public class TimelapseParameter {

    public final ShutterSpeed shutterSpeedMin, shutterSpeedMax;
    public final Aperture apertureMin, apertureMax;
    public final Iso isoMin, isoMax;

    private TimelapseParameter(ShutterSpeed shutterSpeedMin, ShutterSpeed shutterSpeedMax,
                               Aperture apertureMin, Aperture apertureMax,
                               Iso isoMin, Iso isoMax) {

        this.shutterSpeedMin = shutterSpeedMin;
        this.shutterSpeedMax = shutterSpeedMax;
        this.apertureMin = apertureMin;
        this.apertureMax = apertureMax;
        this.isoMin = isoMin;
        this.isoMax = isoMax;
    }
}
