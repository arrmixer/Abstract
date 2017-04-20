package com.AE;

/**
 * Created by Angel on 4/20/17.
 */
public class AppNode3 {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(90);
        myList.insertFirst(88);
        myList.insertLast(99999999);
        myList.displayList();
        myList.insertAfter(50, 25);
        myList.displayList();


}
}
