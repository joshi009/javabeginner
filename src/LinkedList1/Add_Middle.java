package LinkedList1;

class Node2 {
    int data;
    Node next;

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}


public class Add_Middle {
    Node head; // Reference to the first node
    int size = 0;

    // Add node at any position
    public void add(int idx, int data) {
        Node newNode = new Node(data);

        if (idx == 0) { // Insert at head
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }


        Node temp = head;
        int i = 0;


        // Traverse to the (idx-1) position
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Add first node
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add last node
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }
    public int size(){
        return size;
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Add_Middle ll = new Add_Middle();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9); // Insert 9 at index 2


        ll.print(); // Print linked list
        System.out.println("Size of LinkedList: " + ll.size());

    }
}
