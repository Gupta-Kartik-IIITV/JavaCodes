package DSA;
import java.util.*;
public class RotateAnArray {
    //Time Complexity O(n^2)
    public static void rotateTheArray(int[] array,int k){
        int size = array.length-1;
        for(int j=0;j<k;j++) {
            for (int i = 0; i < array.length-1; i++) {
                int temp = 0;
                temp = array[size - i];
                array[size - i] = array[size - i - 1];
                array[size - i - 1] = temp;
            }
        }
        for (int element : array) {
            System.out.print(element + ",");
        }
        System.out.println();
    }

    public static void rotateTheArray2(int[] array,int k) {
        //Time Complexity O(n) but space complexity is higher
        int[] result = new int[array.length];
        k = k % array.length;
        int j=0;
        for(int i= array.length-k+1;i< array.length;i++){
            result[j++] = array[i];
        }
        for(int i=0;i< array.length-k;i++){
            result[j++] = array[i];
        }
        for (int elements:result){
            System.out.print(elements + ",");
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
        System.out.print("Enter The number of times to rotate: ");
        int k = sc.nextInt();
        rotateTheArray(arr,k);
        rotateTheArray2(arr,k);

    }
}
