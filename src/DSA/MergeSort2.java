package DSA;

import java.util.Arrays;

public class MergeSort2 {
    public static void merge(int[] a,int[] b,int[] res){
        int n = a.length;
        int m = b.length;

        int i = 0, j = 0, k = 0;

        while(i<n && j<m){
            if(a[i]<b[j]) res[k++] = a[i++];
            else res[k++] = b[j++];
        }

        while(i<n){
            res[k++] = a[i++];
        }

        while(j<m){
            res[k++] = b[j++];
        }

    }

    public static void mergeSort(int[] nums){
        int n = nums.length;

        // Base case
        if(n==1) return;

        int n1 = n/2;

        // Create the copies of Arrays that are to be recursively sorted
        int[] a = Arrays.copyOfRange(nums,0,n1);
        int[] b = Arrays.copyOfRange(nums,n1,n);

        // Apply mergeSort in these 2 halves of the array
        mergeSort(a);
        mergeSort(b);

        // Merge the 2 sorted arrays
        merge(a,b,nums);

    }


    public static void main(String[] args) {
        int[] n = {22,-6,9,-87,3,3,5,4,8,25,-321,-45,44};
        mergeSort(n);

        System.out.println(Arrays.toString(n));
    }

}
