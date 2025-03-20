package LinkedList1;

public class Iterative_Search {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Iterative search method
    public int itrsearch(int key) { // O(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i; // Found the key
            }
            temp = temp.next;
            i++;
        }
        return -1; // Key not found
    }

    // Print linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Iterative_Search ll = new Iterative_Search(); // Fix: Using custom class, not Java's LinkedList
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(7);

        ll.print(); // Fixed: Now prints the linked list

        System.out.println("Position of 3: " + ll.itrsearch(3)); // Expected output: 2
        System.out.println("Position of 10: " + ll.itrsearch(10)); // Expected output: -1
    }
}
