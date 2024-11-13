package com.company;
import java.util.*;
public class SwapFirstAndLastDigit {

    public static void main(String[] args) {

        int n = 54321;
        int dig = (int)Math.log10(n);
        int ans = n%10;
        ans *= (int)Math.pow(10,dig-1);
        ans = ans + (n%(int)Math.pow(10,dig))/10;
        ans =  ans*10 + (int)(n/Math.pow(10,dig));
        System.out.print(ans);


    }
}
