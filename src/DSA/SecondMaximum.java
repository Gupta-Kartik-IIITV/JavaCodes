package DSA;
import java.util.*;


public class SecondMaximum {
    //Distinct Elements in the array
//    public static int findSecondMaximum(int[] array){
//        int max = array[0];
//        int index = 0;
//        for(int i=0;i<2;i++){
//            for(int j=1;j< array.length;j++){
//                if(array[i]>max){
//                    max = array[i];
//                    index = i;
//                }
//            }
//            if(i==0) {
//                array[index] = Integer.MIN_VALUE;
//                max = array[index];
//            }
//        }
//        return max;
//    }

    //For Non distinct elements
    public static int findMaximum(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public static int findSecondMaximum(int[] array){
        int max = findMaximum(array);
        for(int i=0;i< array.length;i++){
            if(array[i]==max){
                array[i] = Integer.MIN_VALUE;
            }
        }
        max = findMaximum(array);
        return max;
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
        System.out.print("Second Greatest Element is: " + findSecondMaximum(arr));
    }
}
