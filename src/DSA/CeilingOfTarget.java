package DSA;
import java.util.*;

public class CeilingOfTarget {
    public static int ceiling(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while( start <= end){
            int mid = start + (end - start)/2;
            if(nums[end]<target){
                return Integer.MIN_VALUE;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else if( nums[mid] > target){
                end = mid-1;
            }
            else if(nums[mid] == target){
                return nums[mid];
            }

        }
        return nums[start];
    }

    public static int floor(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while( start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid]<target){
                start = mid+1;
            }
            else if( nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid] == target){
                return nums[mid];
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
        return nums[end];
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
        System.out.println(ceiling(arr,15));
        System.out.print(floor(arr,15));

    }
}
