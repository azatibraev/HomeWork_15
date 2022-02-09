package com.company;

public class Singer  extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println(getName() + " is singing a song \" Shape of you \" ");
    }

    public void playGuitar() {
        System.out.println(getName() + " is playing on the guitar \" Martin lx1e little martin\"");
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(" Jazz");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" in the street");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" an Orange");
    }

    @Override
    public String toString() {
        return super.toString() +
                " \nBand Name: " + bandName;
    }
}
