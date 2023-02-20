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

    public void insertAfter(Node<T> prevNode, T data)
    {
        Node <T> newNode = new Node<T>(data);
        newNode.data = data;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public T pop()
    {
        if (head == null)
        {
            return null;
        }
        Node<T> tempNode = head;
        head = head.next;
        return tempNode.data;
    }

    public T popLast()
    {
        Node<T> tempNode = head;
        while(tempNode.next.next != null)
        {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return tempNode.data;
    }

    public void search (T key)
    {
        boolean keyFound = false;
        Node<T> tempNode = head;
        while(tempNode != null)
        {
            if(tempNode.data == key)
            {
                System.out.println("Key found");
                keyFound = true;

            }
            tempNode = tempNode.next;
        }
        if(keyFound == false)
        {
            System.out.println("Key is not found");
        }
    }

    public void insertAfterNode(T key,T data)
    {
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        Node<T> tempNode = head;
        while(tempNode.data != key)
        {
            tempNode = tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }
    public String toString() {
        return "LinkedListMethods{" +
                "head=" + head +
                ", temp=" + temp +
                '}';
    }

}
