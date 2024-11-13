package CS162;

public class CS162Lab06A {
    public static void main(String[] args) {
        //creating an Empty Stack
        StackUsingLL s = new StackUsingLL();

        //checking if the stack is empty
        System.out.println(s.isEmpty());

        //pushing an Element
        s.push(25);
        s.traverseStack();

        //pushing Another Element
        s.push(56);
        s.traverseStack();
        s.push(27);
        s.traverseStack();

        //checking the top of stack and printing its value
        System.out.println(s.top);
        System.out.println(s.peek());

        //popping from the stack and checking its top again
        s.pop();
        s.traverseStack();
        System.out.println(s.top);

        //size of Stack
        System.out.println(s.sizeOfStack());
    }
}


class StackUsingLL{
    Node Top;
    int top = -1;
    StackUsingLL(){}
    StackUsingLL(Object element) {
        Node Top = new Node(element);
        top++;
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(Object element){
        Node new_node  = new Node(element);
        new_node.next = Top;
        Top = new_node;
        top++;
    }
    public Object pop(){
        if(isEmpty()){
//            System.out.println("The Stack is already empty");
            return null;
        }
        else{
            Node pointer = Top;
            Top = Top.next;
            pointer.next = null;
            top--;
            return pointer.data;
        }
    }
    public int sizeOfStack(){
        int size = 0;
        Node pointer = Top;
        while(pointer!=null){
            pointer = pointer.next;
            size++;
        }
        return size;
    }
    public void traverseStack(){
        Node pointer = Top;
        while(pointer!= null){
            System.out.print(pointer.data+",");
            pointer = pointer.next;
        }
        pointer = Top;
        System.out.println();
    }
    public Object peek(){
        return Top.data;
    }
}