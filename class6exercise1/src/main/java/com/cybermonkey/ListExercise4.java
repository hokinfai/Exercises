package com.cybermonkey;

import java.util.List;
import java.util.Stack;

public class ListExercise4 {

    public static void main(String[] args) {
        int n = 5;

        // Declaring the List
        List<Integer> s = new Stack<>();

        // Appending the new elements
        // at the end of the list
        for (int i = 1; i <= n; i++)
            s.add(i);

        // Printing elements
        System.out.println(s);

        // Remove element at index 3
        s.remove(3);

        // Displaying the list after deletion
        System.out.println(s);

        // Downcast List to a stack object
        Stack<Integer> stack = (Stack) s;

        stack.push(4);

        // Displaying the list after deletion
        System.out.println(s);

        stack.pop();

        // Displaying the list after deletion
        System.out.println(s);

        System.out.println(stack.peek());

        // Printing elements one by one
        for (int i = 0; i < s.size(); i++)
            System.out.print(s.get(i) + " ");
    }
}

