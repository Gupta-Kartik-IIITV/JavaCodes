package DSA;

public class DecimalToBinary {
    public static String binary(long x){
        String ans = "";
        while(x>0){
            ans = Integer.toString((int) (x%2)) + ans;
            x>>=1;
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println(binary(3221225471L));
//        System.out.println(Long.toBinaryString());
//        System.out.println(Long.MAX_VALUE);
    }

}
