package DSA;
import java.util.*;
public class ReverseAnArray {
    public static void reverseTheArray(int[] array){
        int size = array.length-1;
        for(int i=0;i< (size/2)+1;i++){
            int temp=0;
            temp = array[i];
            array[i] = array[size-i];
            array[size-i] = temp;
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
        reverseTheArray(arr);
        for(int element: arr){
            System.out.print(element+",");
        }

    }
}
