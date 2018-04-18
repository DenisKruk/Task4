package com.company;

public class Task2 {
    public static void main(String[] args) {
        int min=-1000; //любое число
        int max=1000; //любое число
        int array[] = new int[1000];
        array = getArray(array,min,max);
        System.out.println();
        int a=0;
        int b=249;
        double first=arrifmethick(array,a , b );
        System.out.println(first+" среднее арифметическое диапазон first");
        int c=250;
        int d=499;
        double second = arrifmethick(array,c,d);
        System.out.println(second+" среднее арифметическое диапазон second");
        int e=500;
        int f=749;
        double third =arrifmethick(array,e,f);
        System.out.println(third+" среднее арифметическое диапазон third");
        int g=750;
        int j=999;
        double fourth= arrifmethick(array,g,j);
        System.out.println(fourth+" среднее арифметическое диапазон fourth");
findMax(first,second,third,fourth);
    }

    private static void findMax(double first, double second, double third, double fourth) {
        if(first>second&&first>third&first>fourth) {
            System.out.println("Наибольшее средне арифметическое у диапазона first" );
        }
        else if(first<second&&second>third&second>fourth) {
            System.out.println("Наибольшее средне арифметическое у диапазона second" );
        }
        else if(third>second&&first<third&third>fourth) {
            System.out.println("Наибольшее средне арифметическое у диапазона third" );
        }else{
            System.out.println("Наибольшее средне арифметическое у диапазона fourth");
        }
    }

    private static double arrifmethick(int[] array, int a, int b) {
        int p=0;
        for(int i=a;i<=b;i++){
          p+=array[i];
        }
        return (double) p/250;
    }

    private static int[] getArray(int[] array, int min, int max) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(max-min+1)+min);
            System.out.print(array[i] + ", ");

        }
        return array;
    }
}

