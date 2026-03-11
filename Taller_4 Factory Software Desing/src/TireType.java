package edu.co.ucc;

public class TireType {

    private float type;
    private float size;


    // Constructor
    public TireType(float type, float size) {
        this.type = type;
        this.size = size;
    }

    // Getters and Setters

    public float getType() {
        return type;
    }

    public void setType(float type) {
        this.type = type;
    }

    public float getSize() {
        return size;
    }


    public void setSize(float size) {
        this.size = size;
    }
}
