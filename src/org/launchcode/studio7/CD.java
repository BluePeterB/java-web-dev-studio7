package org.launchcode.studio7;

public class CD extends Disc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    private boolean dirty;
    private int capacityMb = cdCapacityMb;

    public CD(String name, String contents, String discType, boolean dirty) {
        super(name, contents, discType);
        this.dirty = dirty;

    }

    public void clean() {
        this.dirty = false;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    @Override
    public String toString() {
        return "DVD{ ID= " + getId() + ",Name= " + getName()  + ", Capacity= " + capacityMb + ", Contents= " + getContents()
                + ", Disk Type= " + getDiscType()+ ", Dirty? " + dirty + ", Spinning? " + isSpinning()
                + ", Laser On? " + isLaserOn() + ", RPM= " + getRpm() + " }" ;
    }
}
