package com.company;

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber{
    public static double length(int n){
        double len = 0;
        while(n>0)
        {
            int rem = n%10;
            n = n / 10;
            len++;
        }
        return len;
    }

    public static void main(java.lang.String[]args){
        java.util.Scanner reader = new java.util.Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter the number: ");
        int n1=reader.nextInt();
        int n2 = n1;
        double l = length(n1);
        int ns = 0;
        while(n1>0){
            int r = n1 % 10;
            n1 = n1 / 10;
            ns = (int)(ns + Math.pow(r,l));
        }
        if (ns==n2)
            System.out.println("The Following Number is an Armstrong Number");
        else
            System.out.println("The Following Number is not an Armstrong Number");
    }
}