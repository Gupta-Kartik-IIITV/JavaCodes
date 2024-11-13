package DSA;
import java.util.*;

public class LeetCode58 {
    public static int lengthOfLastWord(String s) {
        List<String> arr = new ArrayList<String>();
        int j=0;
        String word = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ' '){
                if(i<s.length()-1 && s.charAt(i+1)==' '){
                    continue;
                }
                else{
//                    System.out.println(word);
                    arr.add(word);
                    word = "";
                }
            }
            else{
                word = word + s.charAt(i);
            }
        }
        arr.add(word);
//        System.out.print(arr.get(arr.size()-1));
        return (arr.get(arr.size()-1)).length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(lengthOfLastWord(s));
    }
}
