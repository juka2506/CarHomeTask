package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bardy car1 = new Bardy(4, "black");
        Bardy car2 = new Bardy(4, "white");
        Bardy car3 = new Bardy(8, "pink");

        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 22, true, false, new ArrayList<>()));
        people.add(new Person("Max", 35, false, false, new ArrayList<>()));
        people.add(new Person("Andre", 37, true, false, new ArrayList<>()));

        System.out.println(people);

        List<Bardy> johnCars = new ArrayList<>();
        johnCars.add(car1);
        people.get(0).setHasBardy(true);
        people.get(0).setBardiesOwned(johnCars);

        List<Bardy> andreCars = new ArrayList<>();
        andreCars.add(car2);
        andreCars.add(car3);
        people.get(2).setHasBardy(true);
        people.get(2).setBardiesOwned(andreCars);

        System.out.println(people);

    }
}
