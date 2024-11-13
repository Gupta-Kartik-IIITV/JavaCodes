package com.company;
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float m1,m2,m3,m4,m5;

        System.out.print("Enter the marks of 1st subject: ");
        m1 = reader.nextFloat();

        System.out.print("Enter the marks of 2nd subject: ");
        m2 = reader.nextFloat();

        System.out.print("Enter the marks of 3rd subject: ");
        m3 = reader.nextFloat();

        System.out.print("Enter the marks of 4th subject: ");
        m4 = reader.nextFloat();

        System.out.print("Enter the marks of 5th subject: ");
        m5 = reader.nextFloat();

        float percentage = (m1+m2+m3+m4+m5)/5;
        System.out.println("The Final Percentage comes out to be: "+percentage);
    }
}
