package com.company;

public class Task4 {
    public static void main(String[] args) {
        int array[]=new int[1];
        try{
            System.out.println(array[2]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Выход за границы массива");
        }
    }
}
