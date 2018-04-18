package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int n=getN();
        int i=(int)(Math.random()*11);
        int array[]=new int[n+i];
        array=getArray(array);
    }

    private static int[] getArray(int[] array) {
        returnarra;
    }

    private static int getN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число больше 0 ");
        int result;
        try {
            result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не числою");
            return getN();
        }
        if (result <= 0 ) {
            System.out.println("Число меньше 0");
            return getN();
        }
        return result;
    }
}
