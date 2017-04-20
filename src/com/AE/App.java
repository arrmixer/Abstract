package com.AE;

/**
 * Created by Angel on 4/18/17.
 */
public class App {
    public static void main(String[] args) {
        Stack theStack = new Stack(5);
        theStack.push('h');
        theStack.push('e');
        theStack.push('l');
        theStack.push('l');
        theStack.push('o');

        while (!theStack.isEmpty()){
            char value = theStack.pop();
            System.out.println(value);
        }

        reverseString("hello");
        System.out.println(reverseString("Hello"));

    }

    public static String reverseString(String str){
        int stackSize = str.length(); // get the max stack size
        Stack theStack = new Stack(stackSize); // we make the stack
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j); // getting a char from the input string
            theStack.push(ch);
        }

        String result = "";

        while (!theStack.isEmpty()){
            char ch = theStack.pop();
            result =result+ch;
            //System.out.print(ch);
        }

        return result;
    }
}
