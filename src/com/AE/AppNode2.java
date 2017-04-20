package com.AE;

/**
 * Created by Angel on 4/20/17.
 */
public class AppNode2 {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(90);
        myList.insertFirst(88);
        myList.insertLast(99999999);
        myList.displayList();
        myList.printLast();
        myList.deleteFirst();
        myList.displayList();
        myList.insertLast(124);
        myList.printLast();
    }
}
