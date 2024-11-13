package DSA;

public class IncreasingSequence {
    public static void increasing(String original,String ans,int k,int idx){
        if(idx==k){
            System.out.println(ans);
        }
        for(int i=0;i<original.length();i++){
            if(idx==0 || ans.charAt(idx-1)<original.charAt(i)){
                increasing(original.substring(0,i)+original.substring(i+1),ans+original.charAt(i),k,idx+1);
            }
        }
    }

    public static void main(String[] args) {
        increasing("1234","",2,0);
    }
}
