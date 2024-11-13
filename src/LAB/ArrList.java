package LAB;

public class ArrList{
    Object[] list;
    int length;
    int size=0; //Number of elements
    ArrList(){
        Object[] list = new Object[5];
        length = 5;
    };
    ArrList(int in_capacity){
        if(in_capacity>1) {
            Object[] list = new Object[in_capacity];
            length = in_capacity;
        }
        else{
            Object[] list = new Object[5];
            length = 5;
        }
    }

    public void increaseSize(){
        Object[] new_list = new Object[2*length];
        for(int i=0;i<length;i++){
            new_list[i] = list[i];
        }
    }

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
            return false;
    }

    public boolean checkIndex(int index){
        if(index>=0 && index<=size){
            return true;
        }
        else{
            return false;
        }
    }

    public Object get(int index){
        if(checkIndex(index)){
            return list[index];
        }
        else{
            System.out.println("Index out of bounds");
            return null;
        }
    }





}