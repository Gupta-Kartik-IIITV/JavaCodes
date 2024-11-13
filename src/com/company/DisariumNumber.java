package com.company;

import java.util.Scanner;

public class DisariumNumber{
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
        java.util.Scanner reader=new java.util.Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter the number: ");
        int n1=reader.nextInt();

        int n2 = n1,i=0,dis=0;
        double l = length(n1);

        while(n1>0){
            double r = n1 % 10;
            n1 = n1 / 10;
            dis += (int)(Math.pow(r,(l-i)));
            i++;
        }

        if(n2==dis){
            System.out.println("The Following Number " + dis + " is a Disarium Number");
        }
        else{
            System.out.println("The Following Number " + dis + " is not a Disarium Number");
        }
    }
}