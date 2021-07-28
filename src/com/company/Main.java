package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bardy> lotteryBardies = new ArrayList<>();
        lotteryBardies.add(new Bardy(4, "black", 4));
        lotteryBardies.add(new Bardy(4, "red", 4));
        lotteryBardies.add(new Bardy(4, "orange", 2));
        lotteryBardies.add(new Bardy(4, "yellow", 4));
        lotteryBardies.add(new Bardy(4, "blue", 2));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Fred", 34, true, true));
        personList.add(new Person("Wilma", 20, true, false));
        personList.add(new Person("Shaggy", 28, false, false));
        personList.add(new Person("Carly", 29, false, false));
        personList.add(new Person("Dan", 30, true, false));

        for (Person person :personList) {
            List<Bardy> bardiesOwned = new ArrayList<>();
            if(person.isLikeBardy() && person.isHasBardy()) {
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setBardiesOwned(bardiesOwned);
            } else if (person.isLikeBardy() && !person.isHasBardy()) {
                bardiesOwned.add(lotteryBardies.get(getRandomIndex(lotteryBardies)));
                person.setHasBardy(true);
                person.setBardiesOwned(bardiesOwned);
            }
        }

        for (Person person : personList) {
            if(person.isLikeBardy() && person.isHasBardy()) {
                System.out.println(person.getName() + " has this " + person.getBardiesOwned().get(0).getColor() + " bardy");
            }
        }
    }

    public static int getRandomIndex(List<Bardy> objectList) {
        return (int)(Math.random() * objectList.size());

    }
}
