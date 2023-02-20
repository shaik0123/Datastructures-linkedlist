package com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("creating a simple linkedlist UC-1");
        LinkedListMethods ll = new LinkedListMethods<>();
        ll.add(56);
        ll.add(30);
        ll.add(70);
        System.out.print(ll);
    }
}
