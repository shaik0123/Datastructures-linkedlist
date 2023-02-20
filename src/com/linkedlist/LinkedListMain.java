package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("creating a simple linkedlist UC-1");
        LinkedListMethods ll = new LinkedListMethods<>();
        ll.add(56);
        ll.add(30);
        ll.add(70);
        System.out.print(ll);

        LinkedListMethods<Integer> ll1 = new LinkedListMethods<>();
        System.out.println("Create a linked list using add method UC-2");
        ll1.add(70);
        ll1.add(30);
        ll1.add(56);
        System.out.println(ll1);
    }
}
