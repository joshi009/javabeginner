package utkarsh;

public class LL {
    class  Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    Node head;
    public void insertFirst(int val)
    {
        Node node=new Node(val);
        if(head==null)
        {
            head=node;
            head.next=null;
        }
        else {
            node.next = head;
            head = node;
        }


    }
    public void display()
    {
        Node node=head;
        while(node!=null)
        {
            System.out.println(node.val);
            node=node.next;
        }
    }
    public  void InsertAtLast(int val)
    {
        Node user=new Node(val);
        if(head==null)
        {
            head=user;
            head.next=null;
            return;
        }
        Node node=head;
        while(node.next!=null)
        {
            node=node.next;
        }
        node.next=user;
    }
public void changeval(int val,int change){
        Node node =head;

        while (node != null){
            if(node.val == val){
                node.val = change;
            }
            node = node.next;
        }
}
public void delete(int val)
{
    if (head == null) return;

    // If the head is the node to delete
    if (head.val == val) {
        head = head.next;
        return;
    }

    Node node = head;
    while (node.next != null && node.next.val != val) {
        node = node.next;
    }

    // If we found the value, skip it
    if (node.next != null) {
        node.next = node.next.next;
    }

}









    public static void main(String[] args) {
        LL l=new LL();
        l.InsertAtLast(1);
        l.InsertAtLast(2);
        l.InsertAtLast(3);
        l.InsertAtLast(4);
        l.changeval(2,6);
         l.delete(6);
        l.display();


    }
  
}
