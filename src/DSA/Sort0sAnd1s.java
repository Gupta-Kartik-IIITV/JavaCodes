package DSA;
import java.util.*;
public class Sort0sAnd1s {
    public static void sortArray(int[] array){
        int right= array.length-1;
        int left = 0;
        int temp;
        while(right>left){
            if(array[right] == 0 && array[left]==1){
                temp = array[right];
                array[right] = array[left];
                array[left] = temp;
                right--;
                left++;
            }
            if(array[left]==0){
                left++;
            }
            if(array[right]==1){
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

        sortArray(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + ",");
        }

    }
}
