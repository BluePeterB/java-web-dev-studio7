package org.launchcode.studio7;

public abstract class AbstractEntity {
    private static int nextId = 1;
    private int id;
    private String name;

    private String contents;
    private String discType;
    public final int dvdRpm = 32000;
    public final int cdRpm = 23000;
    public final int dvdCapacityMb = 17080;
    public final int cdCapacityMb = 700;


    public AbstractEntity(int id) {    //(String name, int id) {
        this.id = id;
    }
/*
    public AbstractEntity() {
        this(nextId);
        nextId++;
    }
*/
    public int getId() {
        return id;
    }

    public AbstractEntity(String name, String contents, String discType) {
        this(nextId);
        nextId++;
        this.name = name;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }


}
