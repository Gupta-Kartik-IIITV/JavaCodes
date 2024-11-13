package DSA;
import java.util.*;
public class CheckIfSorted {
    public static boolean checkIfSorted(int[] array){
        boolean flag = true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Length of the array: ");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Enter The Elements of the array");
        for(int i=0;i<l;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(checkIfSorted(arr));

    }
}
