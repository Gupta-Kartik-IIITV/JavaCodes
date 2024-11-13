package com.company;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        float num;
        int terms;

        System.out.print("Enter The number whose table you need: ");
        num = reader.nextFloat();
        System.out.print("Enter the Number of terms to print: ");
        terms = reader.nextInt();

        for(int i=1;i<=terms;i++){
            System.out.println(num+" * "+i+" = "+(num*i));
        }
    }
}
