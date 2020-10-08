package com.cybermonkey;

public class CommandLineApplication {

    public static void main(String[] args) {
        int howMany = args.length;
        if (howMany == 0) {
            System.out.println("You haven't given any words.");
            return;
        }
        for (int i = howMany - 1; i >= 0; i--){
            System.out.print(" " + args[i]);
        }
        System.out.println();
    }

}

