package com.company;
import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //input from the keyboard
        System.out.print("Enter the temperature: ");
        float temperature = s.nextFloat();
        System.out.print("Enter the scale to convert the temperature to: ");
        char scale = s.next().charAt(0);    //In order to take a character as input

        double convertedTemp;

        //conditions
        if(scale == 'F' || scale == 'f'){
            convertedTemp = (temperature*1.8 + 32);
            System.out.println("The Temperature "+temperature+" in Fahrenheit is "+convertedTemp);
        }
        else if (scale == 'c' || scale == 'C') {
            convertedTemp = ((temperature-32) * (double)(5/9));     //as 5/9 in java returns 0(floor division)
            System.out.println("The Temperature "+temperature+" in celsius is "+convertedTemp);
        }
        else {
            System.out.println("Enter a valid temperature scale");
        }
    }
}
