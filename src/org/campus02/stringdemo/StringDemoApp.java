package org.campus02.stringdemo;

public class StringDemoApp {

    public static void main(String[] args) {

        String string1 = "Das ist ein String";
        String string2 = "Das ist ein String";
        String string3 = new String("Das ist ein String");

        System.out.println("true: string1.equals(string2) = " + string1.equals(string2));
        System.out.println("false: string1 == string2 = " + (string1 == string2));
        System.out.println("true: string1.equals(string3) = " + string1.equals(string3));
        System.out.println("false: string1 == string3 = " + (string1 == string3));


    }
}
