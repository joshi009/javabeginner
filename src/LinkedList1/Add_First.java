package LinkedList1;

import java.util.LinkedList;

public class Add_First {
    int data;
    Add_First next;

    public Add_First(int data) {
        this.data = data;
        this.next = null;
    }


    public static Add_First head;
    public static Add_First tail;

    public void addFirst(int data) {
        //step1 =create new Node
        Add_First newNode = new Add_First(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2 = newNode.next = head
        newNode.next = head;

        //step3 = head = newHead
        head = newNode;
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);

    }}
