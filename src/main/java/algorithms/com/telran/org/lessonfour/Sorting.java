package com.telran.org.lessonfour;

public class Sorting {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};

        int[] result = mergeSortedArrays(a, b);

        System.out.print("Array result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        while (indexA < a.length && indexB < b.length) {
            if (a[indexA] < b[indexB]) {
                c[indexC] = a[indexA];
                indexA++;
            } else {
                c[indexC] = b[indexB];
                indexB++;
            }
            indexC++;
        }

        while (indexA < a.length) {
            c[indexC] = a[indexA];
            indexA++;
            indexC++;
        }

        while (indexB < b.length) {
            c[indexC] = b[indexB];
            indexB++;
            indexC++;
        }

        return c;
    }
}
