package com.cybermonkey;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String args[]) {

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm1
                = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(Integer.valueOf(1), "Geeks");
        hm1.put(Integer.valueOf(2), "Geeks");
        hm1.put(Integer.valueOf(3), "Geeks");
        hm1.put(Integer.valueOf(4), "For");

        System.out.println("Initial Map " + hm1);

        hm1.put(Integer.valueOf(2), "For");
        hm1.remove(Integer.valueOf(4));

        System.out.println("Updated Map " + hm1);
        System.out.println();

        for (Map.Entry<Integer, String> mapElement : hm1.entrySet()) {
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }

    }
}
