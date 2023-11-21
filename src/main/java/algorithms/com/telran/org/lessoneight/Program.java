package com.telran.org.lessoneight;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        startup();
    }

    public static void startup() {
        //taskOne();
        taskTwo();

    }

    public static void taskTwo() {
        int[] coins = {1, 3, 4, 8, 11, 13};
        int[] money = new int[37];
        int[] result = new int[37];

        for (int i = 0; i < money.length; i++) {
            money[i] = i+1;
        }

        for (int i = 0; i < coins.length - 1; i++) {
            for (int j = i + 1; j < coins.length; j++) {
                int sum = coins[i] + coins[j];

                if (sum > 0 && sum < money.length) {
                    if (result[sum-1] == 0) {
                        result[sum-1] = sum;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(money));
        System.out.println(Arrays.toString(result));
    }

    public void taskOne() {
        int[] coins = {10, 5, 1};
        int sum = 81;

        int[] result = getMinCoins(sum, coins);

        if (result != null) {
            System.out.println("Min count of coins: ");
            for (int i = 0; i < result.length; i++) {
                System.out.println(coins[i] + " in count of " + result[i]);
            }
        } else {
            System.out.println("It is impossible to issue this amount with these coins!");
        }
    }


    public static int[] getMinCoins(int sum, int[] coins) {
        int[] result = new int[coins.length];

        for (int i = 0; i < coins.length; i++) {
            if (sum >= coins[i]) {
                result[i] = sum / coins[i];
                sum %= coins[i];
            }
        }

        return (sum == 0) ? result : null;
    }
}
