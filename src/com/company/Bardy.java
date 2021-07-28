package com.company;

public class Bardy extends Car{

    private int noOfSeats;

    public Bardy(int noOfTires, String color, int noOfSeats) {
        super(noOfTires, color);
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String toString() {
        return "Bardy{} with " + getNoOfTires() + " tires in "+ getColor() + " color";
    }
}
