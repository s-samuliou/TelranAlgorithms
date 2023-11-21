package com.telran.org.lessonnine;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        //Task1
        // int[] array = {0, 0, 1, 2, 3, 0, 4, 0, 3, 0, 4};

        /*Task2
        int[] array2 = {1, 0, 2, 3, 6, 4, 5, 9, 11, 12};
        String result = sortAndCreateRanges(array2);
        System.out.println(result);*/

        //Task3
        int[] coins = {1, 4, 6, 10, 2, 5};
        int sum = 21;

        int res = checkMoneyExchange(coins, sum);

        if (res > 0) {
            System.out.println("U can change money");
        } else {
            System.out.println("U can't change money");
        }

    }

    public static int checkMoneyExchange(int[] coins, int sum) {
        if (coins == null || coins.length == 0 || sum == 0) {
            return -1;
        }

        Arrays.sort(coins);

        int start = 0;
        int end = coins.length - 1;

        for (int i = 0; i < coins.length; i++) {
            if (coins[start] + coins[end] == sum) {
                return 1;
            }

            if (coins[start] == sum || coins[end] == sum) {
                return 1;
            }

            if (coins[start] + coins[end] < sum) {
                start++;
            } else {
                end--;
            }
        }

        return -1;
    }

    public static String sortAndCreateRanges(int[] array) {
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

    public static void specialSort(int ...array) {
        if (array == null) {
            return;
        }

        int indexA = 0;
        int indexB = 0;

        for (; indexB < array.length; indexB++) {
            if (array[indexB] != 0) {
                array[indexA] = array[indexB];
                indexA++;
            }
        }

        for (; indexA < array.length; indexA++) {
            array[indexA] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
