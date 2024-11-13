package com.company;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int num = reader.nextInt();
        int rev=0,rem;

        while(num>0){
            rem = num%10;
            num /= 10;
            rev = rem + rev*10;
        }

        System.out.print("The Reversed number is: "+rev);
    }
}
