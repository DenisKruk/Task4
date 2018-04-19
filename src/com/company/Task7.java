package com.company;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int n = getInput();
        System.out.println("цифры числа в обратном порядке");
        System.out.println(recursion(n));
    }

    private static int getInput() {
        System.out.println("введите число");
        Scanner scan = new Scanner(System.in);
        int result=(int)scan.nextInt();
        return result;
    }

    public static int recursion(int n) {
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }

}
