package DSA;
import java.util.*;
public class InfiniteArray {

    public static int infiniteBinarySearch(int[] nums,int target){
        int start = 0;
        int end = 2;
        boolean notFound = true;

        while(notFound){
            while(start<=end){
                int mid = start + (end-start)/2;
                System.out.println(nums[mid]);
                if(nums[mid]==target){
                    notFound = false;
                    return mid;
                }
                else if (nums[start] > target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            start = end+1;
            end = end*2;
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
        System.out.print(infiniteBinarySearch(arr,20));
    }
}
