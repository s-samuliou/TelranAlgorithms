package com.telran.org.lessonnine.homeworknine;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        /*Task1*/
        int[] array2 = {1, 0, 2, 3, 6, 4, 5, 9, 11, 12};
        String result = sortAndCreateRanges(array2);
        System.out.println(result);

        //Task2
        int totalFloors = 19;
        Map<String, Integer> elevators = new HashMap<>();
        elevators.put("A", 0);
        elevators.put("B", 8);

        int targetFloor = 5;
        String closestElevator = elevatorCall(elevators, targetFloor, totalFloors);
        System.out.println("Sending elevator " + closestElevator + " to floor " + targetFloor);
    }

    public static String elevatorCall(Map<String, Integer> elevators, int targetFloor, int totalFloors) {
        if (elevators == null || elevators.isEmpty() || targetFloor > totalFloors) {
            return "Wrong input data";
        }

        int minDistance = Integer.MAX_VALUE;
        String closestElevator = "";

        for (Map.Entry<String, Integer> entry : elevators.entrySet()) {
            int currentFloor = entry.getValue();
            int distance = Math.abs(currentFloor - targetFloor);

            if (distance < minDistance) {
                minDistance = distance;
                closestElevator = entry.getKey();
            }
        }

        return closestElevator;
    }

    public static String sortAndCreateRanges(int[] array) {
        if (array == null || array.length == 0) {
            return "Wrong input data";
        }

        Arrays.sort(array);
        StringBuilder result = new StringBuilder();

        int start = 0;
        int end = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] == 1) {
                end++;
            } else {
                if (array[start] == array[end]) {
                    result.append(array[start] + ",");
                } else {
                    result.append(array[start] + "-" + array[end] + ",");
                }

                start = i;
                end = i;
            }
        }

        if (array[start] == array[end]) {
            result.append(array[start]);
        } else {
            result.append(array[start] + "-" + array[end]);
        }

        return result.toString();
    }
}
