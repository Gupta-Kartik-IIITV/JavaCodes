package DSA;

import java.util.Scanner;

public class NewtonRaphson {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double x = n;
        double xn = (x+(n/x))/2;
        int cnt = 0;

        while(x-xn>=0.000001){
            x = xn;
            xn = (x+(n/x))/2;
            cnt++;

        }
        System.out.println(cnt);
        System.out.println(xn);
        System.out.println(xn*xn);

    }
}
