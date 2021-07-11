package org.launchcode.studio7;

public class DVD extends Disc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private int usedMb;
    private int capacityMb = dvdCapacityMb;

    //String name, int capacityMb, String contents, String discTyp
    public DVD(String name, String contents, String discType, int usedMb) {
        super(name, contents, discType);
        this.usedMb = usedMb;


    }

    public void erase() {
        this.usedMb = 0;
    }

    public int getUsedMb() {
        return this.usedMb;
    }

    public void setUsedMb(int usedMb) {
        this.usedMb = usedMb;
    }

    @Override
    public String toString() {
        return "DVD{ ID= " + getId() + ",Name= " + getName()  + ", Capacity= " + capacityMb + ", Contents= " + getContents()
                + ", Disk Type= " + getDiscType()+ ", Used Mb=" + usedMb + ", Spinning? " + isSpinning()
                + ", Laser On? " + isLaserOn() +  ", RPM= " + getRpm() +  " }" ;
    }

}

