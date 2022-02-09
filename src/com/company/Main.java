package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(" Bill Gates ", "An American business magnate, software developer," +
                        " investor, author, and philanthropist.");

        System.out.println(person);
        System.out.println();

        Programmer programmer = new Programmer(" James Arthur Gosling ", " a Canadian computer scientist.",
                        " Gosling Emacs");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();

        System.out.println();

        Dancer dancer = new Dancer("Michael Jackson", " was an American singer, songwriter and dancer." +
                        " Dubbed the \"King of Pop\", he is regarded as one of the most significant cultural figures of the 20th century.",
                        "Jackson 5");

        System.out.println(dancer);
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();

        System.out.println();

        Singer singer = new Singer("Ed Sheeran ", " an English singer-songwriter.",
                        "Sheeran began recording music in 2004 and independently released " +
                                "his first collection of work, tiled Spinning Man.");
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();
        singer.learn();
        singer.walk();
        singer.eat();
    }
}