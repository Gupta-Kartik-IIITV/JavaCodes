package com.company;
import java.util.Scanner;

public class AreaAndCircumference {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter The radius of the circle: ");
        float radius = s.nextFloat();

        double circumference = 2 * 3.14159265358979323 * radius;
        double area = 3.14159265358979323 * radius * radius;

        System.out.println(circumference);
        System.out.println(area);

    }
}
