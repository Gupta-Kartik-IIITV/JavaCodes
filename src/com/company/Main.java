package com.company;
import java.util.*;

public class Main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        for(int a = 0;a<sc.nextInt();a++){
            int d = sc.nextInt();
            int[][] mat = new int[d][d];
            for(int i=0;i<d;i++){
                for(int j=0;j<d;j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<d;i++){
                System.out.println(Arrays.toString(mat[i]));
            }
        }

    }
}