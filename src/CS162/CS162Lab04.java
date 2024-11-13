package CS162;

public class CS162Lab04 {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(25);
        dll.traverseDLinkedList();
        dll.addAtHead(9);
        dll.traverseDLinkedList();
        dll.addAtTail(36);
        dll.traverseDLinkedList();
        dll.addInBetween(16,2);
        dll.traverseDLinkedList();
        dll.middleOfDlinkedList();
        dll.removeAtAnyPosition(2);
        dll.traverseDLinkedList();
        dll.removeAtHead();
        dll.traverseDLinkedList();
        dll.removeAtTail();
        dll.traverseDLinkedList();
        dll.middleOfDlinkedList();
    }
}
class DoublyLinkedList{
    DoubleNode pointer;
    public DoubleNode dll_head;
    DoublyLinkedList(Object head_data){
        dll_head = new DoubleNode(head_data);
        pointer = dll_head;
    }
    public void addAtHead(Object element){
        DoubleNode new_node = new DoubleNode(element);
        new_node.next = pointer;
        pointer.prev = new_node;
        dll_head = new_node;
        pointer = dll_head;
    }
    public void traverseDLinkedList(){
        while(pointer != null){
            System.out.print(pointer.data + "<->");
            pointer = pointer.next;
        }
        pointer = dll_head;
        System.out.println();
    }
    public void addAtTail(Object element){
        while(pointer.next != null){
            pointer = pointer.next;
        }
        DoubleNode new_node = new DoubleNode(element);
        pointer.next = new_node;
        new_node.prev = pointer;
        pointer = dll_head;
    }
    public int sizeOfDLinkedList(){
        int size=0;
        while(pointer.next != null){
            size++;
            pointer = pointer.next;
        }
        return size;
    }
    public void addInBetween(Object element,int position){
        DoubleNode temp = pointer;
        int index=0;
        while(index != position-2){
            pointer = pointer.next;
            temp = temp.next;
            index++;
        }
        DoubleNode new_node = new DoubleNode(element);
        temp = temp.next;
        pointer.next = new_node;
        new_node.prev = pointer;
        temp.prev = new_node;
        new_node.next = temp;

        pointer = dll_head;
    }
    public void removeAtHead(){
        pointer.next.prev = null;
        dll_head = pointer.next;
        pointer.next = null;
        pointer = dll_head;
    }
    public void removeAtTail(){
        while(pointer.next.next != null){
            pointer = pointer.next;
        }
        pointer.next.prev = null;
        pointer.next = null;
        pointer = dll_head;
    }
    public void removeAtAnyPosition(int position){
        int index = 0;
        DoubleNode temp = pointer.next;
        while(index != position-2){
            pointer = pointer.next;
            temp = temp.next;
            index++;
        }
        temp.next.prev=pointer;
        pointer.next = temp.next;
        temp.next=null;
        temp.prev=null;
        pointer = dll_head;
    }
    public void middleOfDlinkedList(){
            DoubleNode temp = dll_head;
            DoubleNode pointer2 = dll_head;
            while(pointer2 !=null && pointer2.next != null){
                temp = temp.next;
                pointer2 = pointer2.next.next;
            }
            System.out.println(temp.data);
        }
}
class DoubleNode{
    DoubleNode prev,next;
    Object data;
    public DoubleNode(Object data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
