public class Q9 {
    Node reverseList(Node head)
    {   
        Node current=head;
        Node next=head;
        Node prev=null;
        if(head==null)
        return null;
        
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        
        return head;
        // code here
    }
}

    

