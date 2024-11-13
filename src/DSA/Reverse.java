package DSA;

public class Reverse {
    public static long rev(int x,long ans){
        if(x==0){return ans;}
        return rev(x/10,ans*10+ (x%10));
    }

    public static void main(String[] args) {
        System.out.print(rev(25455,0));
    }
}
