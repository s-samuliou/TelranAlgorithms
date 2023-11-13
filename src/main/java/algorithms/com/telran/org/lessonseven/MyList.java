package com.telran.org.lessonseven;

public class MyList {
    public Node head;
    public void append(int item) {
        if (this.head == null) {
            this.head = new Node(item);
            return;
        }

        Node temp = this.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(item);
    }
}
