package org.launchcode.studio7;

public  class Disc  extends AbstractEntity implements OpticalDisc {

    private boolean spinning;
    private int rpm;
    private boolean laserOn;

    public Disc (String name, String contents, String discType) {
        super(name,contents, discType);  // invokes AbstractEntity's void constructor

    }
    @Override
    public void spinDisc () {
        this.spinning = true;
        this.laserOn =true;
        if (this.getDiscType().equals("DVD")) {
            this.rpm = dvdRpm;
        } else if (this.getDiscType().equals("CD")) {
            this.rpm = cdRpm;
        }

    }


    public boolean isSpinning() {
        return spinning;
    }

    public void setSpinning(boolean spinning) {
        this.spinning = spinning;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public boolean isLaserOn() {
        return laserOn;
    }
}
