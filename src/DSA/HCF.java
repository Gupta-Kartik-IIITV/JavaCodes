package DSA;

public class HCF {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    static String FindGcd(long N, int x, int y)
    {
        int n = gcd(x,y);
        String a = "";
        for(int i=0;i<n;i++){
            a += Long.toString(N);
        }
        return a;
    }
    public static void main(String[] args) {
//        System.out.print(gcd(48,27));
        System.out.print(FindGcd(3,48,27));
    }
}
