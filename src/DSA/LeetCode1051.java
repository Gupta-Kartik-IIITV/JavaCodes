package DSA;
import java.util.*;
public class LeetCode1051 {
    public static int[] heightChecker(int[] heights) {
        int i=0;
        int of = 0;
        while(i<heights.length){
            if(heights[i]==i+1-of){
                i++;
            }
            else if(heights[i]==heights[heights[i]-1+of]){
                int temp = heights[i];
                heights[i] = heights[heights[i]-1+of];
                heights[temp-1+of] = temp;
                of++;
                i++;
            }
            else{
                int temp = heights[i];
                heights[i] = heights[heights[i]-of];
                heights[temp-of] = temp;
            }
        }
        return heights;
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

        System.out.print(Arrays.toString(heightChecker(arr)));
    }
}
