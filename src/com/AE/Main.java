package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Counter count = new Counter("count", 0);
        count.increment();
        System.out.println(count.toString());
        count.increment();
        count.increment();
        System.out.println(count.toString());
        System.out.println(count.getCurrentValue());

    }
}
