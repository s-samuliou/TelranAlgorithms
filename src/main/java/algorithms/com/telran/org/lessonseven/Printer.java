package com.telran.org.lessonseven;

public class Printer {
    public String print(Node node) {
        String sb = "";

        while (node != null) {
            sb += node.value + " ";
            node = node.next;
        }

        return sb;
    }

    public String print(MyList list) {
        return this.print(list.head);
    }
}
