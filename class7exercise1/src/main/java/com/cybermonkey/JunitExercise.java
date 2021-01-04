package com.cybermonkey;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JunitExercise {

    public String printString(String string) {
        return string;
    }

    public int addTwoIntegers(int input1, int input2) {
        return input1 + input2;
    }

    public int[] combineArrays(int[] arr1, int[] arr2) {
        int[] resultArray = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            resultArray[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resultArray[arr1.length + i] = arr2[i];
        }
        return resultArray;
    }

    public Integer[] combineArraysWithSteams(int[] arr1, int[] arr2) {
        Integer[] intArray1 = IntStream.of(arr1).boxed().toArray(Integer[]::new );
        Integer[] intArray2 = IntStream.of(arr2).boxed().toArray(Integer[]::new );
        return Stream.concat(Arrays.stream(intArray1), Arrays.stream(intArray2))
              .toArray(Integer[]::new);
    }
}

