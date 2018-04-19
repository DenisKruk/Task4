package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int n = getInput();
        System.out.println("Сумма чисел введенного числа = "+sumOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    private static int getInput() {
        System.out.println("введите число");
        Scanner scan = new Scanner(System.in);
        int result = (int) scan.nextInt();
        return result;
    }
}

