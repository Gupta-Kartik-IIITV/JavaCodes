package DSA;
import java.util.*;

public class OddEvenSort {
    public static void sortEvenOdd(int[] array){
        int left = 0;
        int right = array.length-1;
        int temp;
        while(left<right){
            if(array[left] % 2 !=0 && array[right] % 2 ==0){
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
            if(array[left]%2==0){
                left++;
            }
            if(array[right]%2 != 0){
                right--;
            }
        }
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
        sortEvenOdd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }

    }
}
