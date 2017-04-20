package com.AE;

/**
 * Created by Angel on 4/18/17.
 */
public class AppNode {
    public static void main(String[] args) {
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD =new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(50);
        myList.insertFirst(90);
        myList.insertFirst(88);
        myList.insertLast(99999999);
        myList.displayList();


    }

    public static int listLength(Node oNode){
        int length = 0;
        Node currentNode = oNode;
        
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }

        return length;
    }

}
