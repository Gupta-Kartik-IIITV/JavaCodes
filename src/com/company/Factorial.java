package com.company;

import java.util.Scanner;

public class Factorial{
    public static void main(java.lang.String[]args){
        java.util.Scanner reader=new java.util.Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter the number: ");
        int n1=reader.nextInt();
        int fact=1;

        for(int i=2;i<=n1;i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of "+n1+" is "+fact);
    }
}