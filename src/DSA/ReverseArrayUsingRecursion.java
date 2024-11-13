package DSA;
import java.util.*;
public class ReverseArrayUsingRecursion {
    public static void reverseUsingRecursion(int[] nums,int start,int end){
        if(start>=end){
            return;
        }
        else{
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            reverseUsingRecursion(nums,++start,--end);
        }
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
        reverseUsingRecursion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
