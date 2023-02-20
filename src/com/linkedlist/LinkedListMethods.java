package com.linkedlist;

public class LinkedListMethods<T> {
    Node head;
    Node temp;

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            return;
        }
        temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;

    }

    public void append(T data)
    {
        Node<T> newNode = new Node<T>(data);
        if(head == null)
        {
            head = newNode;
        }
        else
        {
            Node<T> tempNode = head;
            while(tempNode.next != null)
            {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
    public String toString() {
        return "LinkedListMethods{" +
                "head=" + head +
                ", temp=" + temp +
                '}';
    }

}
