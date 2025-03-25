package LinkedList1;

class Node6 {
    int data;
    Node6 next;

    public Node6(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_Linklist {
    private Node6 head;

    public void addFirst(int data) {
        Node6 newNode = new Node6(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node6 newNode = new Node6(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node6 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node6 newNode = new Node6(data);
        Node6 temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid index");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }




    public void reverse(){
        Node6 prev = null;
        Node6 curr  = head;
        Node6 next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Reverse_Linklist ll = new Reverse_Linklist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3); // Add 3 at index 2

        ll.print(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ll.reverse();
        ll.print();


    }
}
