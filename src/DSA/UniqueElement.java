package DSA;
import java.util.*;
public class UniqueElement {
    public static int findUniqueElement(int[] array){
        for(int i=0;i<array.length;i++){
            int count=0;
            for(int j=0;j< array.length;j++){
                if(array[i]==array[j] && i!=j){
                    count++;
                    break;
                }
            }
            if(count==0){
                return array[i];
            }
        }
        return 0;
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
        System.out.print("Unique Element is: " + findUniqueElement(arr));
    }
}
