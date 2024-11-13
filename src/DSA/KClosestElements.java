package DSA;

public class KClosestElements {
    public static int upperBound(int[] nums,int x,int s,int e){
        int ans = -1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]<x) {
                s = mid + 1;
            }
            else{
                ans = nums[mid];
                e = mid-1;
            }
        }
        return ans;
    }
    public static int lowerBound(int[] nums,int x,int s,int e){
        int ans = -1;
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]<=x) {
                ans = nums[mid];
                s = mid + 1;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
