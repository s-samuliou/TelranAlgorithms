package com.telran.org.lessonseven.homeworkseven;

public class Program {
    public static void main(String[] args) {
        SpecialStack myStack = new SpecialStack(); //Create & initialize
        myStack.push(9);
        myStack.push(4);
        myStack.push(11);

        System.out.println("After initializing: " + myStack); // Print myStack

        System.out.println("Get min: " + myStack.getMin()); // Get min

        System.out.println("Delete last element 11:  " + myStack.pop()); // Get & Deleting
        System.out.println("Delete last element 4:  " + myStack.pop());
        System.out.println("Delete last element 9:  " + myStack.pop());

        System.out.println(myStack); // Print myStack
    }
}
