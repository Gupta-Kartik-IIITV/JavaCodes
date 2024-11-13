package CS162;
import java.util.*;

public class CS162Lab03 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Creation of Linked List Object
        LinkedList ll = new LinkedList(25);
        ll.traverseLinkedList();

        //Insert at Head
        ll.insertAtHead(99);
        ll.insertAtHead(36);
        ll.traverseLinkedList();

        //Insert at Tail
        ll.insertAtTail(3);
        ll.insertAtTail(38);
        ll.traverseLinkedList();

        //Insert At Any Index
        ll.insertAtAnyIndex(2,25);
        ll.traverseLinkedList();

        //Finding the middle value
        ll.middleOfLinkedList();

        //Insert at Any index
        ll.insertAtAnyIndex(77,2);
        ll.traverseLinkedList();

        //Reverse The Linked List
        ll.reverseLinkedList();
        ll.traverseLinkedList();

        //Finding the Middle Node
        ll.middleOfLinkedList();

        //Traversing using recursion
        ll.traverseLinkedList2(ll.head);
        System.out.println(ll.pointer.data);
    }
}
class LinkedList{
    public Node head;
    Node pointer;
    LinkedList(){
        head = null;
    }
    LinkedList(Object head_data){
        head = new Node(head_data);
        pointer = head;
    }
    public void insertAtHead(Object value){
        Node new_head = new Node(value);
        new_head.next = head;
        head = new_head;
        pointer = head;
    }
    public void traverseLinkedList(){
        while(pointer!=null){
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        pointer = head;
        System.out.println();
    }

    public Node traverseLinkedList2(Node head){
        if(head==null){
            return null;
        }
        else{
            System.out.print(head.data + "-->");
            return traverseLinkedList2(head.next);
        }
    }
    public void insertAtTail(Object value){
        Node new_tail = new Node(value);
        while(pointer.next!=null){
            pointer = pointer.next;
        }
        pointer.next = new_tail;
        pointer = head;
    }
    public void insertAtAnyIndex(Object valueToAdd, Object valueToAddBefore){
        Node pointer2 = head;
        while(pointer.next.data!=valueToAddBefore){
            pointer = pointer.next;
            pointer2 = pointer2.next;
        }
        Node additional_node = new Node(valueToAdd);
        additional_node.next = pointer.next;
        pointer2.next = additional_node;
        pointer = head;
        pointer2 = null;
    }
    public void removeAtHead(){
        head = head.next;
        pointer.next = null;
        pointer = head;
    }
    public int sizeOfLinkedList(){
        int size=0;
        while(pointer.next!=null){
            pointer = pointer.next;
            size++;
        }
        pointer = head;
        return ++size;
    }
    public void reverseLinkedList(){
        Node cur,prev,nxt;
        prev = pointer;
        cur = prev.next;
        nxt = cur.next;
        while(nxt != null){
            cur.next = prev;
            prev = cur;
            cur = nxt;
            nxt = nxt.next;
        }
        cur.next = prev;
        pointer.next = null;
        head = cur;
        pointer = head;
    }
    public void middleOfLinkedList(){
        Node temp = head;
        Node pointer2 = head;
        while(pointer2 !=null && pointer2.next != null){
            temp = temp.next;
            pointer2 = pointer2.next.next;
        }
        System.out.println(temp.data);
    }
}
class Node{
    Object data;
    Node next;
    Node(){}
    Node(Object data){
        this.data = data;
    }
}