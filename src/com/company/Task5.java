package com.company;

import java.util.Scanner;

public class Task5 {
    public  static String print(String hello){
        System.out.println(hello);
        return "Hello";
    }

    public static int print(int a) {
        System.out.println(a);
        return 0;
    }

    public static final boolean print(boolean c){
        System.out.println(c);
        return false;
    }

    private static void print(int d, String yes){
        System.out.println(d+yes);
    }

    private static double print(double r){
        System.out.println(r);
        return r;
    }

    public static void main(String[] args) {
        System.out.println("input string");
        String hello= getUserInput();
        print(hello);
        System.out.println("input integer");
        int a=Integer.valueOf(getUserInput());
        print(a);
        System.out.println("input boolean");
        boolean c = Boolean.valueOf(getUserInput());
        print(c);
        System.out.println("input integer");
        int d = Integer.valueOf(getUserInput());
        System.out.println("input string");
        String yes=getUserInput();
        print(d,yes);
        System.out.println("input double");
        double r = Double.valueOf(getUserInput());
        print(r);
    }

    private static String  getUserInput() {
        Scanner scan= new Scanner(System.in);
        String input=scan.next();
        return input;
    }
}
