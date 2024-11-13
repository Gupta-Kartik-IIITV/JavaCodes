package DSA;
import java.util.ArrayList;
public class Subsets {
    public static void subsets2(String ans, String original,ArrayList<String> l,boolean flag,int k){
        if (original.equals("")){
            if(ans.length()==k)l.add(ans);
            return;
        }
        else{
            if(original.length()>1 && original.charAt(0)==original.charAt(1)){
                if(flag) subsets2(ans+original.charAt(0),original.substring(1),l,true,k);
                subsets2(ans,original.substring(1),l,false,k);
            }
            else{
                if(flag) subsets2(ans+original.charAt(0),original.substring(1),l,true,k);
                subsets2(ans,original.substring(1),l,true,k);
            }
        }
    }

    public static void subset(String ans,String original) {
        if(original.equals("")){
            System.out.println(ans);
            return;
        }
        else{
            subset(ans+original.charAt(0),original.substring(1));
            subset(ans,original.substring(1));
        }
    }


    public static void main(String[] args) {
//        ArrayList<String> l = new ArrayList<>();
//        subsets2("","aac");

//        System.out.println(l.toString());
    }
}
