package com.cybermonkey;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JunitExerciseTest {

    @Test
    public void returnTheSameStringAsTheOnePassingIn() {
        String helloWorld = "Hello world";

        JunitExercise exercise = new JunitExercise();

        String actual = exercise.printString(helloWorld);
        assertThat(actual, is(helloWorld));
    }

    @Test
    public void assertCorrectResultForAddingTwoIntegers() {
        JunitExercise exercise = new JunitExercise();

        int actual = exercise.addTwoIntegers(1, 2);

        assertThat(actual, is(3));
    }

    @Test
    public void assertTwoArraysHaveBeenCombinedIntoOne() {
        JunitExercise exercise = new JunitExercise();
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] actual = exercise.combineArrays(arr1, arr2);

        int[] expectedArray = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        assertThat(actual, is(expectedArray));
    }

    @Test
    public void assertTwoArraysHaveBeenCombinedIntoOneBySteams() {
        JunitExercise exercise = new JunitExercise();
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        Integer[] actual = exercise.combineArraysWithSteams(arr1, arr2);

        int[] expectedArray = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        assertThat(actual, is(expectedArray));
    }

}
