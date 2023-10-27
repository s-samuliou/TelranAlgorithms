package com.telran.org.lessonfour.homeworkfour;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = {2,6,1,4,7,3,2,8,1,8,0,5,3};
        System.out.println(Arrays.toString(array));

        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int middle = array.length / 2;
        int[] arrayLeft = new int[middle];
        int[] arrayRight = new int[array.length - middle];

        for (int i = 0; i < middle; i++) {
            arrayLeft[i] = array[i];
        }

        for (int i = middle; i < array.length; i++) {
            arrayRight[i-middle] = array[i];
        }

        mergeSort(arrayLeft);
        mergeSort(arrayRight);

        merge(array ,arrayLeft, arrayRight);
    }

    private static void merge(int[] array, int[] arrayLeft, int[] arrayRight) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexArray = 0;

        while (indexLeft < arrayLeft.length && indexRight < arrayRight.length) {
            if (arrayLeft[indexLeft] < arrayRight[indexRight]) {
                array[indexArray++] = arrayLeft[indexLeft++];
            } else {
                array[indexArray++] = arrayRight[indexRight++];
            }
        }

        while (indexLeft < arrayLeft.length) {
            array[indexArray++] = arrayLeft[indexLeft++];
        }

        while (indexRight < arrayRight.length) {
            array[indexArray++] = arrayRight[indexRight++];
        }
    }
}
