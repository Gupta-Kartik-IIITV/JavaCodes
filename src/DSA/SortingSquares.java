package DSA;
import java.util.*;
public class SortingSquares {
    public static int[] reverseArray(int[] array){
        int left=0;
        int right= array.length-1;
        while(left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }
    public static int[] sortTheSquares(int[] array){
        int[] res = new int[array.length];
        int left=0;
        int right = array.length-1;
        int i=0;
        while(left<=right){
            if(Math.abs(array[left])>array[right]){
                res[i] = array[left] * array[left];
                i++;
                left++;
            }
            else{
                res[i] = array[right]*array[right];
                i++;
                right--;
            }
        }
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + ",");
        }
        return reverseArray(res);
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
        arr = sortTheSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
