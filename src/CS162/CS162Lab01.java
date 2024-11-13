package CS162;
public class CS162Lab01 {
    public static void main(java.lang.String[] args) {
        ArrList arrList = new ArrList();
        System.out.println("Size of The array list is: "+arrList.checkArraySize());

        //Printing the newly constructed array list
        arrList.traverseArrayList();

        //Adding into the empty arraylist
        arrList.addAtAnyIndex(2,58);

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //
        //Adding elements to the arraylist
        for(int i=0;i<arrList.checkArraySize();i++){
            arrList.addFirstIndex(i+1);
        }

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Adding element at the last index
        arrList.addLastIndex(25);

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Adding element at the first index
        arrList.addFirstIndex(0);

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Adding element at ith index
        arrList.addAtAnyIndex(3,89);

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Removing The First element
        arrList.removeFirstIndex();

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Removing The Last Index
        arrList.removeLastIndex();

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        //Removing at ith Index
        arrList.removeAtAnyIndex(3);

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());

        arrList.clearTheArray();

        //Output
        arrList.traverseArrayList();
        System.out.print(arrList.checkArrayLength());


    }
}
class ArrList {
    int pointer =0;
    Object[] arr;
    ArrList(){
     this.arr = new Object[10];
    }
    ArrList(Object element){
        this.arr = new Object[10];
        addFirstIndex(element);
    }
    ArrList(Object element,int size){
        this.arr = new Object[size];
        addFirstIndex(element);
    }

    public Object getElement(int Index){
        return arr[Index];
    }
    public void traverseArrayList(){
        System.out.println();
        for(int i=0;i<checkArraySize();i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public void increaseSize() {
         Object[] arr_new = new Object[checkArraySize()*2];
        for (int i = 0; i < checkArraySize(); i++){
            arr_new[i] = arr[i];
        }
        arr = arr_new;
    }
    public void addLastIndex(Object element) {
        if(pointer == checkArraySize()){
            int l_index = checkArraySize() - 1;
            increaseSize();
            arr[l_index + 1] = element;
            pointer++;
        }
        else{
            arr[pointer] = element;
            pointer++;
        }
    }
    public int checkArraySize() {
        return arr.length;
    }
    public int checkArrayLength(){
        return pointer;
    }
    public void addFirstIndex(Object element) {
        if(pointer >= 0 && pointer < checkArraySize()){
            for (int i = pointer - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = element;
            pointer++;
        }
        else if(pointer == checkArraySize()){
            increaseSize();
            for (int i = checkArraySize() - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = element;
            pointer++;
        }
    }
    public void addAtAnyIndex(int index, Object element) {
        if (pointer == checkArraySize()) {
            increaseSize();
            for (int i = checkArraySize() - 1; i > index - 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = element;
            pointer++;
        }
        else if(pointer>=0 && pointer<checkArraySize()) {
            System.out.println("The Array is empty cannot add at random index");
        }

        else{
        System.out.println("Invalid Index Provided");
        }
    }
    public void removeLastIndex(){
        if(pointer == checkArraySize()){
            arr[checkArraySize()-1] = null;
            pointer--;}
        else{
            arr[pointer-1] = null;
            pointer--;
        }
    }
    public void removeFirstIndex(){
        if(pointer>0) {
            for (int i = 0; i < pointer - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[pointer-1] = null;
            pointer--;
        }
        else{
            System.out.println("Null Element at the first index");
        }
    }
    public void removeAtAnyIndex(int index) {
        if(pointer == 0){
            System.out.println("The Array List is already empty");
        }
        else if(arr[index]==null){
            System.out.println("The element is already Null");
        }
        else if (pointer > 0) {
            for (int i = index; i < pointer - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[pointer-1] = null;
            pointer--;
        }
        else{
            System.out.println("Invalid Index Provided");
        }
    }
    public void clearTheArray(){
        for(int i=0;i<pointer;i++){
            arr[i] = null;
        }
        pointer = 0;
    }
}
