package com.AE;

/**
 * Created by Angel on 4/20/17.
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList(){

        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode; // if empty, last will refer to the new Node being created
        }else{
            first.previous = newNode;
        }

        newNode.next = first; // newNode point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;// assign newNode to the end of the list
            newNode.previous = last; // the old last will be the newnodes previous

        }
        last = newNode; // the linkedList's last field should point to the new node
    }

    public void displayList(){
        System.out.println("List (first --> last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void printLast(){
        System.out.println(last.data);
    }

    // assume non-empty list
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ // only one item in the list
            last = null;
        }else{
            first.next.previous = null; // list's first node will point to null
        }

        first = first.next; // we are assigning the reference of the node following the old first node to the first field in the linked list object
        return temp; // return the deleted old first node
    }

    //assume non-empty list
    public Node deleteLast(){ //modifying not really deleting
        Node temp = last;
        if(first.next == null){ // list has only one node
            first = null;
        }else{
            last.previous.next = null;
        }

        last = last.previous;
        return temp;

    }

    // assume non-empty list
    public boolean insertAfter(int key, int data){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null){
                return false;
            }
        }

        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        }else{
            newNode.next = current.next; // new node's next field should point to the node ahead of the current one
            current.next.previous = newNode; //the node ahead of current, it's previous field should point to the new node
        }

        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //assume non-empty list
    public Node deleteKey(int key){
        Node current = first; // start from the beginning
        while(current.data != key){
            current = current.next;
            if(current == null){
                System.out.println("data not present in table");
                return null;
            }
        }

        if(current == first){
            first = current.next; // make the first field point to the node following current since current will be deleted
        }else{
            current.previous.next = current.next;
        }

        if(current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }

        return current;

    }

    public void displayForward(){
        System.out.println("List (first --> last): ");
        Node current = first; // start from the beginning
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void displayBackward(){
        System.out.println("List (last --> first): ");
        Node current = last;
        while(current != null){
            current.displayNode();
            current = current.previous;
        }
        System.out.println();

    }



}
