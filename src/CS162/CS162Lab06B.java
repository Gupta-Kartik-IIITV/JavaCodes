package CS162;

public class CS162Lab06B {
    public static void main(String[] args) {
        Queue qu = new Queue();
        System.out.println(qu.size);
        System.out.println(qu.rear);
        qu.traverseQueue();

        //Adding the Elements into the queue
        qu.enqueue(25);
        qu.enqueue(26);
        qu.enqueue(27);
        qu.enqueue(28);
        qu.enqueue(29);
        qu.enqueue(30);
        qu.enqueue(31);
        qu.enqueue(32);
        qu.enqueue(33);
        qu.enqueue(34);
        qu.traverseQueue();

        //Size will be doubled
        qu.enqueue(35);
        qu.traverseQueue();

        //Deleting the elements of the queue
        qu.dequeue();
        qu.traverseQueue();


        //Peek
        System.out.println(qu.rear);

    }
}

class Queue{
    int front = 0;
    ArrList q = new ArrList();
    int rear = 9;
    Queue(){}
    Queue(Object element){
        this.q = new ArrList(element);
    }
    public int size = q.checkArraySize();
    public int lengthOfQueue(){
        int i = 0;
        while(q.getElement(i)!=null){
            i++;
        }
        return i;
    }
    public boolean isEmpty(){
        if(front==rear){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(Object element){
            q.addLastIndex(element);
            rear++;
    }

    public Object dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is already Empty");
            return "Queue is Empty";
        }
        q.removeFirstIndex();
        return q.getElement(rear--);
    }

    public Object peek(){
        return q.getElement(rear);
    }

    public void traverseQueue(){
        q.traverseArrayList();
    }


}