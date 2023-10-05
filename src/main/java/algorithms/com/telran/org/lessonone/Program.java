package com.telran.org.lessonone;

public class Program {
    public static void main(String[] args) {
        int[] array = {6, 3, 7, 1, 2, 4, 9, 1, 0, 5};

        showArray(array);
        System.out.println("\n");
        bubbleSorting(array);
    }

    public static void bubbleSorting(int ...array) {
        boolean isSorting = false;

        while (!isSorting)
        {
            isSorting = true;

            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    isSorting = false;
                }
            }
        }

        showArray(array);
    }

    public static void showArray(int ...array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}
