package com.AE;

/**
 * Created by Angel on 4/18/17.
 */
public class Counter {
  int count;
  String name = null;

    public Counter(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void increment(){
       count++;
    }

    public int getCurrentValue(){
        return count;
    }



    public String toString() {
        return
        name + " is at " + count + ".";

    }
}
