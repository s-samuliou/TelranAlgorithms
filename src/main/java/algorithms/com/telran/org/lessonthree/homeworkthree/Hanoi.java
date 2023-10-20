package com.telran.org.lessonthree.homeworkthree;

public class Hanoi {

    public static void main(String[] args) {
        int numberOfDisks = 3; // Num of disks
        hanoi(numberOfDisks, 1, 3, 2);
    }

    public static void hanoi(int n, int start, int target, int temp) {
        if (n == 1) {
            System.out.println(" с " + start + " на " + target);
        } else {
            hanoi(n - 1, start, temp, target);
            System.out.println(" с " + start + " на " + target);
            hanoi(n - 1, temp, target, start);
        }
    }
}
