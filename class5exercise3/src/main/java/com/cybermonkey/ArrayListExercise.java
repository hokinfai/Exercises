package com.cybermonkey;

import jdk.internal.jline.console.ConsoleReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExercise {

    public static void main(String[] args) {
        System.out.println("Enter words, one per line.");
        Scanner in = new Scanner(System.in);
        List wordList = new ArrayList();

        /* Read and store the words in 'wordList'. */
        while (true) {
            String word = in.nextLine();
            if (word.equalsIgnoreCase("end"))
                break;
            wordList.add(word);
        }

        /* Output the words in wordList in reverse order. */
        for (int i = wordList.size() - 1; i >= 0; i--)
            System.out.println(wordList.get(i));
    }

}

