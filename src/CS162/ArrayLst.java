package CS162;

public class ArrayLst {

    public ArrayLst(){
        this(10);
    }
    int size;
    Object[] array;
    public ArrayLst(int initialCapacity){
        if(initialCapacity < 1){
            throw new IllegalArgumentException("Capacity should be grater than 1");
        }
        Object[] array = new Object[initialCapacity];
        int size = 0;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int Size(){
        return size;
    }

    public void checkIndex(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Index Out of bounds");
        }
    }

    public Object get(int index){
        checkIndex(index);
        return array[index];
    }

    public int indexOf(Object element){
        for(int i=0;i<size;i++){
            if(element == array[i]){
                return i;
            }
        }
        return -1;
    }

//    public int remove(int index){
////        checkIndex();
//
//    }
}
