package com.company;
import java.util.Scanner;
public class PalindromeNum {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = reader.nextInt();

        int num2;
        num2 = num;
        int rev=0,rem;

        while(num>0){
            rem = num % 10;
            num = num / 10;
            rev = rem + rev*10;
        }

        if(rev==num2){
            System.out.print("The Number "+num2+" is a palindrome number");
        }
        else{
            System.out.print("The Number "+num2+" is not a palindrome number");
        }
    }
}
