package com.cybermonkey;

import java.util.Random;
import java.util.Scanner;

public class NumberMultiplyApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Here are some problems for you to do.");
        String reply;
        do {
            /* Choose two numbers between 1 and 12. */
            int a = rand.nextInt(12) + 1;
            int b = rand.nextInt(12) + 1;

            /* Test if the user knows what is a times b. */
            while (true) {
                System.out.println("What is " + a + " times " + b + "?");
                reply = in.nextLine();
                if (reply.equalsIgnoreCase("Give up")) {
                    System.out.println("The answer is " + a * b);
                    break;
                }
                int value = Integer.parseInt(reply);

                if (value == a * b) {
                    System.out.println("Well done!");
                    break;
                }
                System.out.println("No.  Try again.");
            }

            /* See if the user wants to go on. */
            System.out.println("Do you want another sum (yes/no)?");
            reply = in.next();
        }
        while (reply.equals("yes"));

        System.out.println("Bye");

    }
}

