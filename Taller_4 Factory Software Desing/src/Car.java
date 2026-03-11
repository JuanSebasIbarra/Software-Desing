package edu.co.ucc;

public class Car {
    public String model;
    public String color;
    public int year;
    public ChasissMaterial chasissMaterial;

    //Constructor

    public Car(String model, String color, int year, ChasissMaterial chasissMaterial) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.chasissMaterial = chasissMaterial;
    }

    // Getterts and Setters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ChasissMaterial getChasissMaterial() {
        return chasissMaterial;
    }

    public void setChasissMaterial(ChasissMaterial chasissMaterial) {
        this.chasissMaterial = chasissMaterial;
    }
}
