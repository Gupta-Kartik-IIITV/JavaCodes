package DSA;
import java.util.*;
public class BiggestAndSmallest {

    public static int[] greatestAndLowestElement(int[] array){
        int max =array[0];
        int min = array[0];
        for(int i=1;i< array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
            if(array[i]<min) {
                min = array[i];
            }
        }
        int[] elements = {max,min};
        return elements;
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
        int[] result_array = greatestAndLowestElement(arr);
        System.out.println("Greatest: " + result_array[0] + " Lowest: " + result_array[1]);
    }
}
