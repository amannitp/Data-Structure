public class Q16 {
    Node rearrangeEvenOdd(Node head)
    {
        Node temp=head;
        Node evenHead=null;
        Node evenTempHead=null;
        Node oddHead=null;
        Node oddTempHead=null;
        if(temp.next==null)
         return head;
        int pos=0;
        while(temp!=null){
            if(pos%2!=0){
                if(evenHead==null){
                    evenHead=temp;
                    evenTempHead=temp;
                }
                else{
                    evenTempHead.next=temp;
                    evenTempHead=temp;
                }
            }
            else{
                if(oddHead==null){
                    oddHead=temp;
                    oddTempHead=temp;
                }
                else{
                    oddTempHead.next=temp;
                    oddTempHead=temp;
                }
            }
            pos++;
            temp=temp.next;
        }
        if(pos%2==0){
            oddTempHead.next=null;
        }
        else{
            evenTempHead.next=null;
        }
        
        oddTempHead.next=evenHead;
        return oddHead;
          //  The task is to complete this method
     }
    
}
