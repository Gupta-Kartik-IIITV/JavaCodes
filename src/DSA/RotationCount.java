package DSA;
import java.util.*;
public class RotationCount {
    public static int countRotation(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid>start && nums[mid]>nums[mid+1]){
                return mid+1;
            }
            else if(mid<end && nums[mid]<nums[mid-1]){
                return mid;
            }
            else if(nums[start]>nums[mid]){
                end = mid-1;
            }
            else if(nums[end]<nums[mid]) {
                start = mid + 1;
            }
            else{
                return 0;
            }
        }
        return start+1;
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
        System.out.print(countRotation(arr));
    }
}
