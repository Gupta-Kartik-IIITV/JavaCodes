package com.company;
import java.util.Scanner;

public class Fibbonacci{
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(java.lang.String[]args){
        System.out.println(fibo(4));
    }
}
