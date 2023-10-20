package com.telran.org.lessonthree.homeworkthree;

public class Fibonacci {

    public static int recursiveOperations = 0;
    public static int iterativeOperations = 0;

    public static void main(String[] args) {
        System.out.println("10 calls of recursive function: " + fibonacciRecursion(10)
                + " Operations: " + recursiveOperations);
        System.out.println("10 calls of iterative function: " + fibonacciIteration(10)
                + " Operations: " + iterativeOperations);

        recursiveOperations = 0; // Resetting transaction counters
        iterativeOperations = 0;

        System.out.println("20 calls of recursive function: " + fibonacciRecursion(20)
                + " Operations: " + recursiveOperations);
        System.out.println("20 calls of iterative function: " + fibonacciIteration(20)
                + " Operations: " + iterativeOperations);

        recursiveOperations = 0; // Resetting transaction counters
        iterativeOperations = 0;

        System.out.println("30 calls of recursive function: " + fibonacciRecursion(30)
                + " Operations: " + recursiveOperations);
        System.out.println("30 calls of iterative function: " + fibonacciIteration(30)
                + " Operations: " + iterativeOperations);
    }

    public static int fibonacciRecursion(int n) {
        recursiveOperations++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
        }
    }

    public static int fibonacciIteration(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
            iterativeOperations++;
        }

        return result;
    }
}
