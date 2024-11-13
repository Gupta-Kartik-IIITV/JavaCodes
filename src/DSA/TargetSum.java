package DSA;
import java.util.*;
public class TargetSum {
    public static int targetSum(int[] array,int sum){
        int count=0;
        for(int i=0;i< array.length;i++){
            int target = sum-array[i];
            for(int j=i;j<array.length;j++){
                if(array[j]==target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number of elements: ");
        int l = sc.nextInt();
        int[] arr = new int[l];

        System.out.println("Enter The elements");
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print(targetSum(arr,7));
    }

}
