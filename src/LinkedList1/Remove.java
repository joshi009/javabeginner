package LinkedList1;



    class Node3 {
        int data;
        Node next;

        public Node3(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public class Remove {
        Node head,tail; // Reference to the first node
        int size = 0;

        // Add node at any position
        public void add(int idx, int data) {
            Node newNode = new Node(data);

            if (idx == 0) { // Insert at head
                newNode.next = head;
                head = newNode;
                if(tail == null){
                    tail = newNode;
                }
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

            //if add at last position , update tail
            if (newNode.next == null){
                tail =newNode;
            }
            size++;
        }

        // Add first node
        public void addFirst(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

            if(tail == null){
                tail = newNode;
            }
            size++;
        }

        // Add last node
        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;

            if (head == null) {
                head = tail = newNode;
                return;
            }

             tail.next = newNode;
            tail = newNode;
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
        public int removeFirst(){
            if (size == 0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
        public int removeLast(){
            if(size == 0){
                System.out.println("ll is empty");
                return Integer.MIN_VALUE;
            }else if(size == 1){
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            // prev : i = size-2
            Node prev = head;
            for(int i=0; i<size-2;i++){
                prev = prev.next;
            }
            int val = prev.next.data;  //tail.data
            prev.next =  null;
            tail = prev;
            size--;
            return val;
        }

        public static void main(String[] args) {
//            LinkedList1.Add_Middle ll = new LinkedList1.Add_Middle();
            Remove ll = new Remove();
            ll.addFirst(2);
            ll.addFirst(1);
            ll.addLast(3);
            ll.addLast(4);
            ll.add(2, 9); // Insert 9 at index 2


            ll.print(); // Print linked list
//            System.out.println("Size of LinkedList: " + ll.size());

            ll.removeFirst();
            ll.print();

             ll.removeLast();
             ll.print();
            System.out.println(ll.size);

        }
    }

