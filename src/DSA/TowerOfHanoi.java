package DSA;
import java.util.ArrayList;
public class TowerOfHanoi {
    public static void towerOfHanoi(int n, int s,int m,int e,ArrayList<ArrayList<Integer>> l){
        if(n==1){
            ArrayList<Integer> a = new ArrayList<>();
            a.add(s);
            a.add(e);
            l.add(a);
        }
        else{
            towerOfHanoi(n-1,s,e,m,l);
            ArrayList<Integer> a = new ArrayList<>();
            a.add(s);
            a.add(e);
            l.add(a);
            towerOfHanoi(n-1,m,e,s,l);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        towerOfHanoi(3,1,3,2,l);
        System.out.println(l.toString());
    }
}
