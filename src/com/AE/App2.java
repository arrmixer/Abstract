package com.AE;

/**
 * Created by Angel on 4/18/17.
 */
public class App2 {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(1000);
        myQueue.insert(14);
        myQueue.insert(12);
        myQueue.insert(44);
        myQueue.insert(2);
        myQueue.insert(20);
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());
        System.out.println(myQueue.remove());

        myQueue.view();

    }
}
