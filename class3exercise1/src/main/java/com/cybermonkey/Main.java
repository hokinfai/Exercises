package com.cybermonkey;

public class Main {
    public static void main(String args[]) {
        Student studentJudy = new Student("A000001", "Judy", "Communication");

        System.out.println(studentJudy.display());


        Student studentTom = new Student("3452", "Tom", "Computer Science");

        System.out.println(studentTom.display());

    }
}
