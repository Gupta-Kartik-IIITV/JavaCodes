package DSA;
import java.util.*;
public class LeetCode410 {

        public static int[] sumAndMax(int[] arr,int start,int end){
            int sum=0;
            int max = arr[0];
            int[] r_arr = new int[2];
            for(int i=start;i<end;i++){
                sum+=arr[i];
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            r_arr[0] = sum;
            r_arr[1] = max;
            return r_arr;
        }

        public static int splitArray(int[] nums, int k) {
            int[] array = sumAndMax(nums,0,nums.length);
            int start = array[1];
            int end = array[0];
            while(start<end){
                int m=0;
                int mid = start + (end-start)/2;
                System.out.println("start " + start);
                System.out.println("mid " + mid);
                System.out.println("end " + end);
                int sum=0;
                for(int i=0;i<nums.length;i++){
                    sum+=nums[i];
//                    System.out.println("Sum: " + sum);
                    if(i==nums.length-1 || sum+nums[i+1]>mid){
                        m++;
                        sum=0;
                    }
                    System.out.println("m: " + m);
                }
                if(m<=k){
                    end = mid;
                }
                else{
                    start = mid+1;
                }
//                if(start==end){
//                    return start;
//                }
            }
            return start;
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

        System.out.println(splitArray(arr,2));

    }
}
