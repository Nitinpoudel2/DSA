package src;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Theory of Relativity");
        stack.push("Universe");
        stack.push("Grokking Algorithms");
        stack.push("Atomic Habits");

        String myFavBook = stack.pop();
        System.out.println(stack);
        System.out.println(myFavBook);
    }
}