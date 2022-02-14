package com.company;

public class Dancer  extends Person {

    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println(getName() + " is dancing a \"Moon walk\""); //don't use getter here!
    }

    @Override
    public void learn() {
        super.learn();
        System.out.println(" Break dance");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" in the Manhattan");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" a pineapple");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Group Name: " + groupName;
    }
}
