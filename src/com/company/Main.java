package com.company;

public class Main {

    public static void main(String[] args) {
        int min=-10; //любое число
        int max=10; //любое число
        int array[] = new int[10];
        int minus = getArray(array,min,max);
        System.out.println("\nКолличество отрицательных "+ minus);
    }

    private static int getArray(int[] array, int min, int max) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*(max-min+1)+min);
            System.out.print(array[i] + ", ");
            if (array[i] < 0) {
                b += 1;
            }
        }
        return b;
    }
}
