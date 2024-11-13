package CS162;
public class CS162Lab05A {
    public static void main(String[] args) {

        //Creation of Circular Linked List
        CircularLinkedList cll = new CircularLinkedList(28);
        cll.traverseCircularLinkedList();

        //Insertion At Head
        cll.insertAtHead(25);
        cll.traverseCircularLinkedList();

        //Insertion At Tail
        cll.insertAtTail(22);
        cll.traverseCircularLinkedList();

        //Insertion At Any Index
        cll.insertAtAnyIndex(20,1);
        cll.traverseCircularLinkedList();

        //Removal at Head
        cll.removeAtHead();
        cll.traverseCircularLinkedList();

        //Removal at Tail
        cll.removeAtTail();
        cll.traverseCircularLinkedList();

        //Insertion At Tail
        cll.insertAtTail(23);
        cll.traverseCircularLinkedList();

        //Removal At Any Index
        cll.removeAtAnyIndex(0);
        cll.traverseCircularLinkedList();



        //Stack

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
class CNode{
    Object data;
    CNode next;
    CNode(Object data){
        this.data = data;
        this.next = this;
    }
}
class CircularLinkedList{
    public CNode head;
    CNode pointer;
    CircularLinkedList(Object element){
        head = new CNode(element);
        pointer = head;
    }

    public int sizeOfCircularLinkedList(){
        int size=0;
        pointer = pointer.next;
        while(pointer != head){
            pointer = pointer.next;
            size++;
        }
        return ++size;
    }

    public void traverseCircularLinkedList(){
        System.out.println();
        System.out.print(">");
        System.out.print(pointer.data + "-->");
        pointer = pointer.next;
        while(pointer != head) {
            System.out.print(pointer.data + "-->");
            pointer = pointer.next;
        }
    }

    public void insertAtHead(Object element){
        CNode new_head = new CNode(element);
        new_head.next = head;
        while(pointer.next != head){
            pointer = pointer.next;
        }
            pointer.next = new_head;
        head = new_head;
        pointer = head;
    }

    public void insertAtTail(Object element){
        CNode new_tail = new CNode(element);
        pointer = pointer.next;
        while(pointer.next != head) {
            pointer = pointer.next;
        }
        pointer.next = new_tail;
        new_tail.next = head;
        pointer = head;
    }

    public void insertAtAnyIndex(Object element, int Index){
        if(Index==0){
            insertAtHead(element);
        }
        else {
            CNode new_node = new CNode(element);
            int pos = 1;
            while (pos < Index) {
                pointer = pointer.next;
                pos++;
            }
            new_node.next = pointer.next;
            pointer.next = new_node;
            pointer = head;
        }
    }

    public void removeAtHead(){
        while(pointer.next != head){
            pointer = pointer.next;
        }
        head = pointer.next.next;
        pointer.next = head;
        pointer = head;
    }

    public void removeAtTail(){
        while(pointer.next.next!=head){
            pointer = pointer.next;
        }
        pointer.next = pointer.next.next;
        pointer = head;
    }

    public void removeAtAnyIndex(int index){
        int pos = 1;
        if(index==0){
            removeAtHead();
        }
        else {
            while (pos < index) {
                pointer = pointer.next;
                pos++;
            }
            pointer.next = pointer.next.next;
            pointer = head;
        }
    }
}

