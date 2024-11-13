package DSA;

public class EqualSumPartition {

    public static int[] prefixArray(int[] nums){
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        return prefix;
    }


    public static void main(String[] args) {
        int[] arr = {1,1};

        int[] pre = prefixArray(arr);

        for(int i=0;i<arr.length-1;i++){
            if(2*pre[i] == pre[pre.length-1]){
                System.out.println("Partition Begins at index: " + (i+1));
                break;
            }
        }
        System.out.print("No Partition Possible");

    }
}
