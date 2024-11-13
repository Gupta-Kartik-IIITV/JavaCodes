package DSA;

import java.util.ArrayList;

public class GenerateParanthesis {
    public static void generateParanthesis(String ans, int n, int op, int cl, ArrayList<String> l){
        if(cl==n){
            l.add(ans);
            return;
        }
        if(op<n){
            generateParanthesis(ans+"(",n,op+1,cl,l);
        }
        if(op>cl){
            generateParanthesis(ans+")",n,op,cl+1,l);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        int n = 3;
        generateParanthesis("",n,0,0,ans);
        System.out.print(ans.toString());
    }
}
