package com.telran.org.lessontwo.homeworktwo;

public class AlgorithmAnalysis {
    public static void main(String[] args) {

    }

     /*Task #1
    START
    READ number n
    IF n == 1 THEN return
    FOR i = 1, i <= n, i + 1
        FOR j = 1; j <= n, j + 1
            print "*"
            BREAK
    END*/
    public static void task1(int n) { //O(1)
        if (n == 1) { //O(1)
            return;
        }

        for (int i = 1; i <= n; i++) { //O(n)
            for (int j = 1; j <= n; j++) { //O(n)
                System.out.print("*"); //O(1)
            }
            System.out.println(); //O(1)
        }
    } //Simple operations can be ignored.
    // As a result we get: O(n^2)

    /* Task #2
    START
    READ number n
    numbers i = 0, j = 0, a = 0
    FOR i = n/2, i <= n; i + 1
        FOR j = 2, j <= n, j * 2
            a = a + n / 2
    END*/
    public static void task2(int n) { //O(1)
        int a = 0; //O(1)
        for (int i = n / 2; i <= n; i++) { //O(n/2)
            for (int j = 2; j <= n; j *= 2) { //O(log2(n))
                a += n / 2; //O(1)
            }
        }
        System.out.println("Result: " + a); //O(1)
    }//Simple operations can be ignored.
    // As a result we get: O(n/2 * log2(n))
    //This result can be simplified: O(n * log2(n))

    /*Task #3
    START
    READ number n
    number a = 0
    FOR i = 0, i < n, i + 1
        FOR j = n, j > i, j - 1
            a = a + i + j
    END*/
    public static void task3(int n) { //O(1)
        int a = 0; //O(1)
        for (int i = 0; i < n; i++) { //O(n)
            for (int j = n; j > i; j--) { //O((n+1)/2) On average, the number of operations be equal to(n/2)
                a += i + j; //O(1)
            }
        }
        System.out.println("Result: " + a); //O(1)
    }//Simple operations can be ignored.
    // As a result we get: O(n * (n+1)/2)
    //This result can be simplified: O(n^2)

    /*Task #4
    START
    READ number n
    numbers a = 0, i = n
    WHILE i > 0
        a = a + i
        i = i / 2
    END*/
    public static void task4(int n) { //O(1)
        int a = 0; //O(1)
        int i = n; //O(1)
        while (i > 0) { //O(log2(n))
            a += i; //O(1)
            i /= 2; //O(1)
        }
        System.out.println("Result: " + a); //O(1)
    }//Simple operations can be ignored.
    // As a result we get: O(log2(n))
}
