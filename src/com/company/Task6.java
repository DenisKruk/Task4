package com.company;

public class Task6 {
    public static void main(String[] args) {
        // if (intValue == 3) { print(“first”); } else if (intValue == 4) { print(“second”); } else { print(“third”)
        int intValue=(int)(Math.random()*(5-2+1)+2);
        System.out.println(intValue);
        switch (intValue) {
            case 3:
                System.out.println("first");
                break;
            case 4:
                System.out.println("second");
                break;
            default:
                System.out.println("third");
        }
    }
}
