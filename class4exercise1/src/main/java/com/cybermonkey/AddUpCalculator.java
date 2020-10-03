package com.cybermonkey;

import java.util.Scanner;

public class AddUpCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many values are there: ");
        int n = in.nextInt();

        System.out.println("Enter the values.");
        double total = 0;
        int i = 0;
        while (i < n) {
            total = total + in.nextDouble();
            i++;
        }

        System.out.println("The total is " + total);

    }
}
