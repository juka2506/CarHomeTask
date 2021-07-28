package com.company;

import java.util.List;

public class Person {

    private String name;
    private int age;
    private boolean likeBardy;
    private boolean hasBardy;
    private List<Bardy> bardiesOwned;

    public Person(String name, int age, boolean likeBardy, boolean hasBardy) {
        this.name = name;
        this.age = age;
        this.likeBardy = likeBardy;
        this.hasBardy = hasBardy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLikeBardy() {
        return likeBardy;
    }

    public void setLikeBardy(boolean likeBardy) {
        this.likeBardy = likeBardy;
    }

    public boolean isHasBardy() {
        return hasBardy;
    }

    public void setHasBardy(boolean hasBardy) {
        this.hasBardy = hasBardy;
    }

    public List<Bardy> getBardiesOwned() {
        return bardiesOwned;
    }

    public void setBardiesOwned(List<Bardy> bardiesOwned) {
        this.bardiesOwned = bardiesOwned;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", likeBardy=" + likeBardy +
                ", hasBardy=" + hasBardy +
                ", bardiesOwned=" + bardiesOwned +
                '}';
    }
}
