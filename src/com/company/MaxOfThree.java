package com.company;
import java.util.Scanner;
public class MaxOfThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter The first Number: ");
        int a = reader.nextInt();

        System.out.print("Enter The second Number: ");
        int b = reader.nextInt();

        System.out.print("Enter The third Number: ");
        int c = reader.nextInt();

        int m1 = (a >= b)?a:b;
        int m2 = (c >= m1)?c:m1;

        System.out.println("The Greatest of the 3 numbers is: "+m2);
    }
}
