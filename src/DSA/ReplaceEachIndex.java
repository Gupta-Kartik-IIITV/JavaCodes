package DSA;

public class ReplaceEachIndex {
    public static void main(String[] args) {
        int[] nums = {5,2,10};
        int lower = Integer.MIN_VALUE;
        int upper = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++) {
            double a = (nums[i] + nums[i - 1])/2.0;
            if (nums[i - 1] - nums[i] > 0) {
                if (lower <= (int) Math.ceil(a)) lower = (int) Math.ceil(a);
            }
            else {
                if (upper > a) upper = (int)a;
            }
        }

        System.out.print("[" + lower + "," + upper + "]");

        for (int ele: nums) {
            System.out.println(Math.abs(ele-lower));
        }
    }
}
