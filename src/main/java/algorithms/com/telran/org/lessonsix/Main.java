package com.telran.org.lessonsix;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyArrayList mal = new MyArrayList();

        for (int i = 0; i < 10; i++) {
            mal.append(new Random().nextInt(10));
        }

        System.out.println(mal.getIndex());
        System.out.println("Default array 'mal': " + mal);

        System.out.println("Find index of element 5, result is: " + mal.findIndexByElement(5));

        System.out.println("Delete element by index 0: ");
        mal.deleteElementByIndex(0);
        System.out.println("Result array 'mal': " + mal);
    }
}

class MyArrayList {
    private int[] storage;
    private int index;

    public MyArrayList() {
        this.storage = new int[2];
        this.index = 0;
    }

    public int findIndexByElement(int element) {
        for (int i = 0; i < this.storage.length; i++) {
            if (this.storage[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public void deleteElementByIndex(int index) {
        if (index < 0 || index >= this.index) {
            System.out.println("Wrong index!");
            return;
        }

        int n = this.storage.length;
        int newIndex = 0;
        int[] temp = new int[n - 1];

        for (int i = 0; i < n; i++) {
            if (i != index) {
                temp[newIndex] = this.storage[i];
                newIndex++;
            }
        }

        this.storage = temp;
        this.index--;
    }

    public void append(int item) {
        if (this.storage.length == this.index) {
            int[] temp = new int[2 * this.storage.length];
            for (int i = 0; i < this.storage.length; i++) {
                temp[i] = this.storage[i];
            }
            this.storage = temp;
        }

        this.storage[this.index] = item;
        this.index += 1;
    }

    public int getIndex() {
        return this.index;
    }

    private void oldAppend(int item) {
        int n = this.storage.length;
        int[] temp = new int[n + 1];

        for (int i = 0; i <= n - 1; i++) {
            temp[i] = this.storage[i];
        }

        temp[n] = item;
        this.index += 1;
        this.storage = temp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < this.index; i++) {
            sb.append(String.format("%d ", this.storage[i]));
        }
        sb.append(']');
        return sb.toString();
    }
}
