package com.company;

import java.util.Scanner;

public class Patterns {
    public static void rectangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void stairs(int n){
        System.out.println();   //Blank Line
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberStair(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void numberStep(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void reverseStairs(int n){
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseNumberStairs(int n){
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void doubleReversedNumberStairs(int n){
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void isoscelesTriangle(int n){
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseIsoscelesTriangle(int n){
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfDiamond(int n){
        System.out.println();
        for(int i=0;i<(2*n);i++){
            if (i<=n){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int k=0;k<2*n-i;k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void alternateBinary(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if ((i-j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static void mirrorNumberStairs(int n){
        System.out.println();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int s=0;s<2*(n-i);s++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void countingStairs(int n){
        System.out.println();
        int a = 0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" "+(i+a)+" ");
                a++;
            }
            a--;
            System.out.println();
        }
    }

    public static void alphabetStairs(int n){
        System.out.println();
        char alphabet = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }
    }

    public static void reverseAlphabetStairs(int n){
        System.out.println();
        char alphabet = 'A';
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(alphabet+j));
            }
            System.out.println();
        }
    }

    public static void reverseAlphabetStep(int n){
        System.out.println();
        int alphabet = 65;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)alphabet);
            }
            alphabet++;
            System.out.println();
        }
    }

    public static void alphabetIsosceles(int n){
        System.out.println();
        int alphabet = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print((char) (alphabet++));
            }
            --alphabet;
            for(int k=1;k<=i;k++) {
                System.out.print((char) (--alphabet));
            }
            System.out.println();
        }
    }

    public static void alphabeticalReverseStairs(int n){
        System.out.println();
        int alphabet = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+n-1+(j-i)));
            }
            System.out.println();
        }
    }

    public static void rectangleWithHollowDiamond(int n){
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int s=0;s<2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            if(i>1){
            System.out.println();}
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int s=0;s<2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondH(int n){
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int s=0;s<2*(n-i-1);s++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            for(int s=0;s<2*(n-i);s++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int n){
        System.out.println();
        for(int i=0;i<n;i++){
            if( i==0 || i==n-1 ){
                for(int j=0;j<n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=0;j<n-2;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(java.lang.String[]args){
        java.util.Scanner reader=new java.util.Scanner(java.lang.System.in);

        java.lang.System.out.print("Enter the number: ");
        int n1=reader.nextInt();
        //1
        rectangle(n1);
        //2
        stairs(n1);
        //3
        numberStair(n1);
        //4
        numberStep(n1);
        //5
        reverseStairs(n1);
        //6
        reverseNumberStairs(n1);
        //7
        doubleReversedNumberStairs(n1);
        //8
        isoscelesTriangle(n1);
        //9
        reverseIsoscelesTriangle(n1);
        //10
        diamond(n1);
        //11
        halfDiamond(n1);
        //12
        alternateBinary(n1);
        //13
        mirrorNumberStairs(n1);
        //14
        countingStairs(n1);
        //15
        alphabetStairs(n1);
        //16
        reverseAlphabetStairs(n1);
        //17
        reverseAlphabetStep(n1);
        //18
        alphabetIsosceles(n1);
        //19
        alphabeticalReverseStairs(n1);
        //20
        rectangleWithHollowDiamond(n1);
        //21
        diamondH(n1);
        //22
        hollowRectangle(n1);
        //23

    }
}