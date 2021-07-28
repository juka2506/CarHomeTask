package com.company;

public class Car {

    private int noOfTires;
    private String color;

    public Car(int noOfTires, String color) {
        this.noOfTires = noOfTires;
        this.color = color;
    }

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfTires=" + noOfTires +
                ", color='" + color + '\'' +
                '}';
    }
}
