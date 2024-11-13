package CS162;

public class CS162Lab5B {
    public static void main(String[] args) {
        Stack s = new Stack();

        //Pushing the elements
        for(int i=0;i<5;i++){
            s.push(5+i);
            s.traverseStack();
        }


        //Increasing The Size
        s.push(10);
        s.traverseStack();

        //Popping the element
        s.pop();
        s.traverseStack();
    }
}

class Stack{
    Object[] stack = new Object[5];
    int top = 5;
    public int lengthOfStack(){
        int length =0;
        for (Object element:stack){
            length++;
        }
        return length;
    }
    public void increaseSize(){
        Object[] arr = new Object[lengthOfStack()+1];
        for(int i=0;i<lengthOfStack();i++){
            arr[i] = stack[i];
        }
        stack = arr;
    }
    public boolean isEmpty(){
        if(top>=lengthOfStack()){
            return true;
        }
        else{
            return false;
        }
    }

    public int seek(){
        return lengthOfStack() - top -1;
    }

    public void push(Object element){
        if(seek() == lengthOfStack()-1){
            increaseSize();
            for(int i=lengthOfStack()-1;i>0;i--){
                stack[i] = stack[i-1];
            }
            stack[top] = element;
        }
        else{
            stack[top-1] = element;
            top--;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty");
        }
        else{
            stack[top] = null;
        }
    }

    public void traverseStack(){
        System.out.println();
        for (int i=lengthOfStack()-1;i>-1;i--){
            System.out.print(stack[i]+",");
        }
    }




}

