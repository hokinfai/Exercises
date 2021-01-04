package com.cybermonkey;

import java.util.Scanner;

public class RainFallApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        /* Read rainfall figures. */
        int[] rainData = new int[12];
        System.out.println("Enter rainfall data.");
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i] + ": ");
            rainData[i] = input.nextInt();
        }

        /* Display histogram of rainfall data. */
        System.out.println();
        for (int i = 0; i < rainData.length; i++) {
            System.out.print(month[i] + "  ");
            for (int n = 0; n < rainData[i] / 2; n++) {
                System.out.print("X");
            }
            System.out.println();
        }

        /* Print scale. */
        System.out.print("     ");
        for (int p = 0; p <= 100; p = p + 10) {
            System.out.print(p + "   ");
        }
        System.out.println();
    }
}

