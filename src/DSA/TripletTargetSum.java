package DSA;
import java.util.*;
public class TripletTargetSum {
    public static int[][] tripletSum(int[] array,int sum){
        int count=0;
        int[][] triplet_array =  new int[array.length][3];
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                for(int k=j+1;k< array.length;k++){
                    if(array[i] + array[j] + array[k] == sum){
                        triplet_array[count][0] = array[i];
                        triplet_array[count][1] = array[j];
                        triplet_array[count][2] = array[k];
                        count++;
                        break;
                    }
                }
            }
        }
        return triplet_array;
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
        int[][] result =  tripletSum(arr,3);
        for(int i=0;i< result.length;i++){
                System.out.println(result[i][0]+","+result[i][1]+","+result[i][2]);
        }
    }
}
