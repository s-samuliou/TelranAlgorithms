package com.telran.org.lessonseven;

public class Program {

    public static void main(String[] args) {
        /*Node root = new Node(10);
        root.next = new Node(11);
        root.next.next = new Node(12);
        root.next.next.next = new Node(13);

        System.out.println(new Printer().print(root));*/

        MyList ml = new MyList();
        ml.append(9);
        ml.append(10);
        ml.append(11);
        ml.append(12);

        String res = new Printer().print(ml);
        System.out.println(res);
    }
}
