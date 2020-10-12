package com.cybermonkey;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise5 {

    public static void main(String[] args) {
        Set<String> h = new TreeSet<>();

        // Adding elements into the HashSet
        // using add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("China");
        h.add("Korea");
        h.add("Japan");

        // Adding the duplicate element
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);

        // Removing items from HashSet using remove()
        h.remove("Australia");
        h.remove("Korea");
        System.out.println("Set after removing Australia and Korea:" + h + "\n");

        // Iterating over hash set items
        System.out.println("Iterating over set:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + "\t");
        }
    }
}

