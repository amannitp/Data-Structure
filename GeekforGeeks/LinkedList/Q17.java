public class Q17 {
    Node rearrangeEvenOdd(Node head)
    {
        Node odd=head;
        Node oddHead=head;
        Node even=(head==null?null:head.next);
        Node evenHead=even;
        while(odd.next!=null && even.next!=null){
            odd.next=(odd.next!=null?odd.next.next:null);
            even.next=(even.next!=null?even.next.next:null);
            even=even.next;
            odd=odd.next;
        }
        odd.next=evenHead;
        return oddHead;
          //  The task is to complete this method
     }
    
}
