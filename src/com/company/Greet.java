package com.company;
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");

        String name = reader.next();
        System.out.println("Hello "+name+" Have a great day");
    }
}
