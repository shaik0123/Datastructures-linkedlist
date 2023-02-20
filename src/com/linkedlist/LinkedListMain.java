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

        System.out.println("Create a linked list using append method UC-3");
        LinkedListMethods<Integer> ll2 = new LinkedListMethods<>();
        ll2.append(56);
        ll2.append(30);
        ll2.append(70);
        System.out.println(ll2);

        System.out.println("Insert a node 30 between 56 and 70 UC-4");
        LinkedListMethods<Integer>ll3 = new LinkedListMethods<>();
        ll3.append(56);
        ll3.append(70);
        ll3.insertAfter(ll3.head,30);
        System.out.println(ll3);

        System.out.println("Delete the first element in the linked list UC-5");
        ll3.pop();
        System.out.println(ll3);

        System.out.println("Delete the last element in the linked list UC-6");
        ll2.popLast();
        System.out.println(ll2);

    }
}
