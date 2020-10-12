package com.cybermonkey;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.google.common.collect.Sets.newHashSet;

public class SetExercise2 {

    public static void main(String[] args) {
        Set<Integer> a = newHashSet(1, 3, 2, 4, 8, 9, 0);
        Set<Integer> b = newHashSet(1, 3, 7, 5, 4, 0, 7, 5);

        // To find union
        Set<Integer> union = newHashSet(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = newHashSet(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);
    }
}

