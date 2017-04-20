package com.AE;

/**
 * Created by Angel on 4/18/17.
 */
public class Node {
    public Node next = null;
    public int data;
    public Node previous = null;


    public void displayNode(){
        System.out.println("{ " + data + " }");
    }
}
