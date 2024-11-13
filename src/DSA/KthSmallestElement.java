package DSA;

public class KthSmallestElement {

    public static int pivotIdx(int[] nums,int s,int e){
        int cnt =0;
        int pivot = (s+e)/2;
        for(int i=s;i<=e;i++){
            if(i==pivot) continue;
            else if(nums[i] <= nums[pivot]) cnt++;
        }

        int temp = nums[pivot];
        nums[pivot] = nums[s+cnt];
        nums[s+cnt] = temp;

        pivot = s+cnt;

        while(s<=e){
            while(nums[s]<nums[pivot]) s++;
            while(nums[e]>nums[pivot]) e--;

            if(s<=e){
                temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        return pivot;
    }


    public static int quickSelect(int[] nums,int start,int end,int k){
        // if(start>=end) return -1;

        int piv = pivotIdx(nums, start, end);

        if(piv==k-1) return nums[piv];

        if(piv<k-1){ return quickSelect(nums, piv+1, end, k);}

        return quickSelect(nums, start, piv-1, k);
    }


    public static void main(String[] args) {
        int[] arr = {5,9,1,8,10,6,4};
        System.out.print(quickSelect(arr,0,arr.length-1,5));
    }
}
