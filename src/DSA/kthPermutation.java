package DSA;

public class kthPermutation {
    public static int fact(int n){
        int fact=1;
        for(int i=n;i>1;i--){
            fact*=i;
        }
        return fact;
    }
    public static String perm(String orig,int n,String ans,int k){
        if(orig.length()==0){
            return ans;
        }
        // int cnt = 0;
        int f = fact(n-1);
        int idx = (k%f==0)?(k/f)-1:(k/f);
        int q = (k%f==0)?f:k%f;
        return perm(orig.substring(0,idx)+orig.substring(idx+1),n-1,ans+orig.charAt(idx),q);
    }

    public static void main(String[] args) {
        System.out.print(perm("1234",4,"",20));
    }
}
