public class Q12 {
    public static Node reverseDLL(Node  head)
{    
   Node temp=null;
   Node current=head;
   while(current!=null){
       temp=current.prev;
       current.prev=current.next;
       current.next=temp;
       current=current.prev;
   }
   if (temp != null) {
            head = temp.prev;
        }
    return head;
}

    
}
