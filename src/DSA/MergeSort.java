package DSA;
import java.util.*;
public class MergeSort {

    public static int[] merge(int[] nums1,int[] nums2){
        int p1 = 0 ,p2 = 0;
        int[] nums = new int[nums1.length + nums2.length];
        int i=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<=nums2[p2]){
                nums[i] = nums1[p1];
                i++;
                p1++;
            }
            else{
                nums[i] = nums2[p2];
                p2++;
                i++;
            }
        }
        for(int j=p1;j<nums1.length;j++){
            nums[i] = nums1[j];
            i++;
        }
        for(int j=p2;j<nums2.length;j++){
            nums[i] = nums2[j];
            i++;
        }
        return nums;
    }

    public static int[] mergeSort(int[] nums,int start,int end){
        if(end==start){
            return new int[] {nums[start]};
        }
        else{
            int mid  = (start+end)/2;
            int[] lsorted = mergeSort(nums,start,mid);
            int[] rsorted = mergeSort(nums,mid+1,end);
            return merge(lsorted,rsorted);

        }
    }

    public static int[] mergeSort2(int[] nums){
        if(nums.length==1){
            return nums;
        }
        else{
            int mid = nums.length/2;
            int[] left = mergeSort2(Arrays.copyOfRange(nums,0,mid));
            int[] right = mergeSort2(Arrays.copyOfRange(nums,mid,nums.length));
            return merge(left,right);
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

        System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
        System.out.println(Arrays.toString(mergeSort2(arr)));
    }
}
