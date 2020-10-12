package com.cybermonkey;

import java.util.ArrayList;
import java.util.List;

public class ListExercise3 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println("Initial ArrayList " + al);

        al.remove(1);

        System.out.println("After the Index Removal " + al);

        al.remove("Geeks");

        System.out.println("After the Object Removal " + al);
    }
}

