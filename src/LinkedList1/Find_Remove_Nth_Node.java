package LinkedList1;

class Node7 {
    int data;
    Node7 next;

    public Node7(int data) {
        this.data = data;
        this.next = null;
    }
}

public class  Find_Remove_Nth_Node {
    private Node7 head;

    public void addFirst(int data) {
        Node7 newNode = new Node7(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node7 newNode = new Node7(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node7 temp = head;
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
        Node7 newNode = new Node7(data);
        Node7 temp = head;
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
        Node7 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }





    public void delethNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node7 temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
          head = head.next;  //removeFirst
          return;
        }
//       // sz-n
        int i = 1;
        int iToFind = sz-n;
        Node7 prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        Find_Remove_Nth_Node ll = new Find_Remove_Nth_Node();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3); // Add 3 at index 2

        ll.print(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ll.delethNthfromEnd(3);
        ll.print();


    }
}
