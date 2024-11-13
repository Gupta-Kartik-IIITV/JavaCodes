package DSA;
import java.util.*;

public class QuickSort {
    public static void quickSort(int[] nums,int start, int end){
        if(start>=end){
            return;
        }
        int s = start;
        int e = end;
        int pivot = nums[s + (e-s)/2];
        while(s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }

            //The above loops may find a violation that is after the start and end cross the pivot entry which means the array is sorted
            //Therefore we need to make this check again so unlike mergeSort quick sort stops at this step and returns the array
            if(s<=e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        //pivot at the right index therefore call recursively the right and the left part of the array to be sorted further
        quickSort(nums,start,e);
        quickSort(nums,s,end);

    }

    public static void main(String[] args) {


        int[] arr = {5,9,8,7,3,6,5,4,12,11};

        quickSort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));
//        System.out.println(arr[arr.length/2]);
    }

}
