package com.telran.org.lessonseven.homeworkseven;

public class SpecialStack {
    private final int DEFAULT_CAPACITY = 2;
    private final double GROW_FACTOR = 1.5;
    private int[] elements;
    private int[] minStack;
    private int index;
    private int minIndex;

    public SpecialStack() {
        this.elements = new int[DEFAULT_CAPACITY];
        this.minStack = new int[DEFAULT_CAPACITY];
        this.index = -1;
        this.minIndex = -1;
    }

    public int getMin() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return 0;
        }

        return minStack[minIndex];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return 0;
        }

        if (elements[index] == minStack[minIndex]) {
            minIndex--;
        }

        return elements[index--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return 0;
        }

        return elements[index];
    }

    public void push(int element) {
        if (this.index + 1 == this.elements.length) {
            grow();
        }

        this.elements[++index] = element;

        if (minIndex == -1 || element <= minStack[minIndex]) {
            minStack[++minIndex] = element;
        }
    }

    public boolean isEmpty() {
        return index < 0;
    }

    private void grow() {
        int newCapacity = (int) (this.elements.length * GROW_FACTOR);
        int[] newElements = new int[newCapacity];
        int[] newMinStack = new int[newCapacity];

        for (int i = 0; i <= this.index; i++) {
            newElements[i] = this.elements[i];
            newMinStack[i] = this.minStack[i];
        }

        this.elements = newElements;
        this.minStack = newMinStack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= this.index; i++) {
            sb.append(this.elements[i] + " ");
        }

        return sb.toString();
    }
}
