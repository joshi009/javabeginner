package LinkedList1;

class Node8 {
    int data;
    Node8 next;

    public Node8(int data) {
        this.data = data;
        this.next = null;
    }
}

public class   Linklist_Palindrome {
    private Node8 head;

    public void addFirst(int data) {
        Node8 newNode = new Node8(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node8 newNode = new Node8(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node8 temp = head;
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
        Node8 newNode = new Node8(data);
        Node8 temp = head;
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
        Node8 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }



//slow-fast Approach
     public Node8 findMid(Node8 head){
        Node8 slow = head;
        Node8 fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow;   //slow is midNode
     }

     public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
         Node8 midNode = findMid(head);

        //step2 - reverse 2nd half
         Node8 prev = null;
         Node8 curr = midNode;
         Node8 next;
         while (curr != null){
             next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
         }
         Node8 right = prev;  //right half head
         Node8 left = head;

         //step3 - check left half and right half
         while (right  != null){
             if(left.data != right.data){
                 return false;
             }
             left = left.next;
             right = right.next;
         }
         return true;
     }

    public static void main(String[] args) {
         Linklist_Palindrome ll = new Linklist_Palindrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
//        ll.addLast(1);
//        ll.add(2, 3); // Add 3 at index 2

        ll.print(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> null
        System.out.println(ll.checkPalindrome());


    }
}
