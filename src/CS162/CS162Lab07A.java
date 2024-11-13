package CS162;

import java.util.Stack;

public class CS162Lab07A {
    public static void main(String[] args) {

        LlQueue qu = new LlQueue();

//        System.out.println(qu.lengthOfQueue());

        qu.enqueue(27);
//        System.out.println(qu.lengthOfQueue());
        qu.traverseList();

        qu.enqueue(28);
        qu.traverseList();

//        qu.enqueue(29);
//        qu.traverseList();

        qu.dequeue();
        qu.traverseList();

        System.out.println(qu.peek());

//        qu.dequeue();
//        qu.traverseList();



    }
}

class LlQueue{
    Node front = new Node();
    Node rear = new Node();
//    Node pointer = front;

//    LlQueue(Object element){
//        Node front = new Node(element);
//        rear = front;
//    }

    public int lengthOfQueue(){
        Node pointer = front;
        int length = 0;
        if(pointer.data==null){
            return length;
        }
        while(pointer.next!=null){
            length++;
            pointer = pointer.next;
        }
        pointer = front;
        return ++length;
    }

    public void enqueue(Object element){
        if(lengthOfQueue()==0){
            front.data = element;
            rear = front;
        }
        else {
            Node new_node = new Node(element);
            rear.next = new_node;
            rear = new_node;
        }
    }

    public boolean isEmpty(){
        if(lengthOfQueue()==0){
            return true;
        }
        else{
            return false;
        }
    }

    public Object dequeue(){
        if(isEmpty()){
            return "The Queue is Already Empty";
        }
        else{
            Node pointer = front;
            front = front.next;
            return pointer.data;
        }
    }

    public void traverseList() {
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        }
        else {
            Node pointer = front;
            while (pointer != null) {
                System.out.print(pointer.data + "->");
                pointer = pointer.next;
            }
            pointer = front;
            System.out.println();
        }
    }

    public Object peek(){
        if(isEmpty()){
            return "The Queue is Empty";
        }
        else{
            return rear.data;
        }
    }
}

