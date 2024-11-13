package DSA;

import java.util.Arrays;

public class QuickSort2 {

    public static void quickSort(int[] nums,int start,int end){
        int s = start;
        int e = end;
        int pivot = nums[(s+e)/2];

        if(s>e) return;

        while(s<=e){

            while(nums[s]<pivot){
                s++;
            }

            while(nums[e]>pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        quickSort(nums,start,e);
        quickSort(nums,s,end);
    }


    public static void main(String[] args) {
        int[] array = {5,1,8,2,3};

        quickSort(array,0,array.length-1);

        System.out.print(Arrays.toString(array));

    }
}
