package DSA;

public class Permutation {
    public static void permutations(String ans,String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        else{
            for(int i=0;i<original.length();i++){
                permutations(ans+original.charAt(i),original.substring(0,i)+original.substring(i+1));
            }
        }
    }

    public static boolean permutations2(String ans,String original, String s){
        if(original.isEmpty()){
            if(s.contains(ans)){
                return true;
            }
        }
        boolean x=false;
        for(int i=0;i<original.length();i++){
            x = permutations2(ans+original.charAt(i),original.substring(0,i)+original.substring(i+1),s );
        }
        return x;
    }
    public static void main(String[] args) {
//        permutations("","2134");
        permutations2("","ab","ab");
    }
}
