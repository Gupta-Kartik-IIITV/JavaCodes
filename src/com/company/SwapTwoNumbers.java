package com.company;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        int a;
        a = reader.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b;
        b = reader.nextInt();

        System.out.println("Before Swapping a = "+a+" b = "+b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swapping a = "+a+" b = "+b);
    }
}
