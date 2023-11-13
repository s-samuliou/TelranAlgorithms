package com.telran.org.lessonseven;

public class CustomStack {
    int[] storage = new int[10];
    int index = 0;

    public void push(int value) {
        if (this.index < this.storage.length) {
            this.storage[this.index] = value;
            this.index++;
        } else {
            System.out.println("Something wrong!");
            //throw new Exception("Stack is overloded!");
        }
    }

    public int pop() {
        return this.storage[--this.index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.index; i++) {
            sb.append(this.storage[i] + " ");
        }

        return sb.toString();
    }
}
