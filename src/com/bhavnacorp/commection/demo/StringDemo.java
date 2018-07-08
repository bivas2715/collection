package com.bhavnacorp.commection.demo;

public class StringDemo {
    public static void main(String[] args) {
        //Creating object through string literal
        //String is immutable , means we can not change the vallue of string

        String str = "abhi";
        System.out.println(str);

        //Cancadanate 2 string
        str = str + "raj";
        System.out.println(str);

        //String length
        int length = str.length();
        System.out.println(length);


        //Now we r creating object through new keyword

        String string  = new String("Abhishek");
        System.out.println(string);

        string = string + "Himanshi";
        System.out.println(string);


    }
}
