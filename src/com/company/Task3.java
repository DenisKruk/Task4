package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int max=100,min=0;
        int n=getN(max,min);
        int i=(int)(Math.random()*6);
        int j=(int)(Math.random()*6);
        int array[]=new int[n+i];
        int array1[]=new int[n+j];
        System.out.println("First array is ");
        array=getArray(array,max,min);
        System.out.println("\nSecond array is ");
        array1=getArray(array1,max,min);
        arrayVsArray1(array,array1,n);
    }

    private static void arrayVsArray1(int[] array, int[] array1,int n) {
        int b=0;
        for(int i=0;i<array.length;i++){
            for(int j:array1){
                if (j==array[i]){
                    b++;
                }
            }
        }
        if (b>=n){
            System.out.println("\nМассивы похожи"+b);
        }else{
            System.out.println("\nМассивы не похожи. Число повторений "+b);
        }
    }

    private static int[] getArray(int[] array,int max,int min) {
        for (int i = 0; i < array.length; i++) {
            while (true) {
                int randomNumber = (int) (Math.random() * (max - min + 1) + min);
                if (!checkNumber(array, randomNumber)) {
                    array[i] = randomNumber;
                    System.out.print(array[i] + ", ");
                    break;
                }
            }
        }
            return array;
        }

        private static boolean checkNumber(int[] arr, int randomNumber) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == randomNumber) {
                    return true;
                }
            }
            return false;
        }

    private static int getN(int max, int min) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от "+min+" до "+max/2);
        int result;
        try {
            result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не числою");
            return getN(min,max);
        }
        if (result <min || result>max/2 ) {
            System.out.println("Число не от "+min+" до "+max/2);
            return getN(min,max);
        }
        return result;
    }
}
