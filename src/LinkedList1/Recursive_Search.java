package LinkedList1;

class Node5 {
    int data;
    Node5 next;

    public Node5(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Recursive_Search {
    private Node5 head;

    public void addFirst(int data) {
        Node5 newNode = new Node5(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node5 temp = head;
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
        Node5 newNode = new Node5(data);
        Node5 temp = head;
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
        Node5 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private int helper(Node5 head, int key) {  //o(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        return (idx == -1) ? -1 : idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        Recursive_Search ll = new Recursive_Search();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3); // Add 3 at index 2

        ll.print(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        System.out.println(ll.recSearch(3));  // Expected output: 2
        System.out.println(ll.recSearch(10)); // Expected output: -1
    }
}
