package DSA;
import java.util.*;

public class FrequencyArray {
    public static boolean isPresent(int[] array,int k){
        boolean flag = false;
        int[] freq_array = new int[100001];
        for(int i=0;i<array.length;i++){
            freq_array[array[i]]++;
        }
        if(freq_array[k]>0){
            flag = true;
        }
        return flag;
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
        System.out.print("Enter the Number of Elements to check: ");
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Enter The Element to check: ");
            int n = sc.nextInt();
            System.out.println(n + " is present in the array: " + isPresent(arr,n));
        }
    }
}
