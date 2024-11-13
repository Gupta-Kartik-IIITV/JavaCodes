package CS162;
import java.util.*;


public class CS162Lab08 {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.insert(26);
        h.insert(7);
        h.insert(62);
        h.insert(9);
        h.insert(8);
        h.traverseHeap();

        System.out.println(h.delete(1));
        h.traverseHeap();

        System.out.println("maximal element is: " + h.maximal());

        System.out.println(h.find(4));

        h.replace(9);
        h.traverseHeap();

        h.insert(100);
        h.traverseHeap();

        System.out.println("Levels" + h.levels());

    }
}
class Heap{
    Heap(){}
    ArrayList<Integer> heap = new ArrayList<Integer>();

    public void heapify(){
        int pointer = heap.size()-1;
        while(pointer>0){
            if((heap.get(pointer) > heap.get((pointer-1)/2))){
                int temp = heap.get(pointer);
                heap.set(pointer,heap.get((pointer-1)/2));
                heap.set((pointer-1)/2,temp);
                pointer--;
            }
            else{
                pointer--;
            }
        }
    }

    public void insert(int element){
        heap.add(element);
        heapify();
    }

    public void traverseHeap(){
       for(int i=0;i<heap.size();i++){
           System.out.print(heap.get(i) + ",");
       }
        System.out.println();
    }

    public int maximal(){
        return heap.get(0);
    }

    public int delete(int index){
        int rem_element = heap.remove(index);
        heapify();
        return rem_element;
    }

    public int find(int element){
        for(int i=0;i<heap.size();i++){
            if(heap.get(i) == element){
                return i;
            }
        }
        return -1;
    }

    public void replace(int element){
        heap.remove(0);
        insert(element);
    }

    public int levels(){
        int size = heap.size();

        return (int)(Math.log(size)/Math.log(2));
    }

}