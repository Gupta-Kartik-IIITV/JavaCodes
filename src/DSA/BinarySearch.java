package DSA;
import java.util.*;
public class BinarySearch {
    public static int binarySearchUsingRecursion(int start,int end,int[] nums,int target){
        int mid = start + (end-start)/2;
        if (nums[mid]==target){
            return mid;
        }
        if(start>end){
            return -1;
        }
        if(nums[mid]>target){
            return binarySearchUsingRecursion(start,mid-1,nums,target);
        }
            return binarySearchUsingRecursion(mid+1,end,nums,target);

    }
    public static int binarySearch(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
        }
        return -1;
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
        System.out.println(binarySearch(arr,15));
        System.out.println(binarySearchUsingRecursion(0,arr.length-1,arr,200));
    }
}
