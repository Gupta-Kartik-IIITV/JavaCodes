package DSA;
import java.util.*;

public class PrefixPartition {
    public static int[] prefixSum(int[] array){
        int[] prefix = new int[array.length];
        prefix[0] = array[0];
        for(int i=1;i< array.length;i++){
            prefix[i] = prefix[i-1] + array[i];
        }
        return prefix;
    }

    public static int[] suffixSum(int[] array){
        int[] suffix = new int[array.length];
        suffix[array.length-1] = array[array.length-1];
        for(int i= array.length-1; i>0;i--){
            suffix[i] = suffix[i+1] + array[i];
        }
        return suffix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of elements: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter The elements");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int[] s = suffixSum(arr);
        int[] p = prefixSum(arr);
        for(int i=0;i<arr.length-1;i++){
            if(p[i]==s[i+1]){
                System.out.println("True");
            }
        }
    }
}
