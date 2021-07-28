package com.company;

public class Bardy extends Car{

    public Bardy(int noOfTires, String color) {
        super(noOfTires, color);
    }

    @Override
    public String toString() {
        return "Bardy{} with " + getNoOfTires() + " tires in "+ getColor() + " color";
    }
}
