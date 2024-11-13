package DSA;
import java.util.*;
public class LeetCode {
    public static void reverse(int[] array,int start, int end){
        for(int i=0;i<=(end-start)/2;i++){
            int temp = array[i+start];
            array[i+start] = array[end-i];
            array[end-i] = temp;
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] + ",");
        }
        System.out.println();
    }
    public static void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of elements: ");
        int l = sc.nextInt();
        int e = sc.nextInt();
        System.out.print(l + (e-l)/2);

//        int[] arr = new int[l];
//
//        System.out.println("Enter The elements");
//        for (int i = 0; i < l; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==0){
//                for(int j = arr.length-1;j>i;j--){
//                    arr[j] = arr[j-1];
//                }
//                i++;
//            }
//            System.out.println();
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[j] + ",");
//            }
//        }
////        rotate(arr,3);
////        for(int i=0;i<=arr.length-1;i++){
////            System.out.print(arr[i] + ",");
////        }

    }
}
