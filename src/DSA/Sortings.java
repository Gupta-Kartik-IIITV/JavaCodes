package DSA;
import java.util.*;

public class Sortings{
    static void bubbleSort(int[] nums){
        boolean swap = false;
        for(int i=0;i<nums.length-1;i++){ //n-1 passess
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    swap = true;
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(!swap){  //If no swapping took place Just return as the array then is already sorted
                return;
            }
        }
    }

    static void insertionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
    }

    static void selectionSort(int[] nums){
        for(int i=0;i<nums.length-1;i++){ //No need to Check for the last element as it will be at its right position after all the elements have been swapped to their roght positions

            int min = nums[i];
            int index = i;
            for (int j=i+1;j<nums.length;j++){
                if(nums[j]<min){
                    min = nums[j];
                    index = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }

    public static void cyclicSort(int[] nums){
        int j=0;
        while(j<nums.length-1){
            if(nums[j] == j+1){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[nums[j]-1];
                nums[temp-1] = temp;
            }
        }
    }

    public static int[] findDisappearedNumbers(int[] nums) {
        int i=0;
        // List<Integer> res = new List<Integer>;
        while(i<nums.length){
            if(nums[i] == nums[nums[i]-1] || nums[i] == i+1){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
        }
        return nums;
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

        selectionSort(arr);

        System.out.print(Arrays.toString(arr));


    }

}
