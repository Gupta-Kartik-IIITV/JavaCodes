package com.company;

import java.util.Arrays;

public class GST {
    public static void main(String[] args) {

        double[] price = {736.29,2687.66,2946.77,5627.98,945.51,959.19,4783.87,4138.17,4138.17,7827.70,4356.58,4926.28};
        String[] battery = {"XLTZ4A","34B19L","38B20L","","XLTZ5A","XL5LB","DIN50","RIDE700R","RIDE700L","DRIVE130R","DIN44LH","DRIVE80R"};
        for(int i=0; i<price.length;i++){
            price[i] *= 1.28;
            System.out.println(battery[i] + "\t == \t" + price[i]);
        }

//        System.out.print(Arrays.toString(price));
    }
}
