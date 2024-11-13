package CS162;

public class CS162Lab07B {
    public static void main(String[] args) {

        StackQueue sq = new StackQueue();

        System.out.println(sq.sqIsEmpty());

        //Adding elements to the stack
        sq.enqueue(25);
        sq.enqueue(27);
        sq.enqueue(28);
        sq.traverseQueue();

        System.out.println(sq.lengthOfQueue());

        sq.dequeue();
        sq.traverseQueue();

        System.out.println(sq.lengthOfQueue());

        System.out.println(sq.sqIsEmpty());
        System.out.println(sq.peek());


    }
}

class StackQueue{
    StackUsingLL main_stack = new StackUsingLL();
    StackUsingLL temp_stack = new StackUsingLL();

    StackQueue(){}

    public boolean sqIsEmpty(){
        if (main_stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public void enqueue(Object element){
        main_stack.push(element);
    }

    public Object dequeue(){
        if(sqIsEmpty()){
            return "The Queue is Empty";
        }
        else{
            while(!main_stack.isEmpty()){
                temp_stack.push(main_stack.pop());
            }
            Object removed_element = temp_stack.pop();
            while(!temp_stack.isEmpty()){
                main_stack.push(temp_stack.pop());
            }
            return removed_element;
        }
    }

    public void traverseQueue(){
        while(!main_stack.isEmpty()){
            temp_stack.push(main_stack.pop());
        }
        temp_stack.traverseStack();
        while(!temp_stack.isEmpty()){
            main_stack.push(temp_stack.pop());
        }
    }

    public int lengthOfQueue(){
        if(sqIsEmpty()){
            return 0;
        }
        else{
            return main_stack.sizeOfStack();
        }
    }

    public Object peek(){
        Object element = main_stack.pop();
        main_stack.push(element);
        return element;
    }
}