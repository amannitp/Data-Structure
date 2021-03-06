public class Q26 {
    static Node addTwoLists(Node head1, Node head2){
        Node temp1=head1;
        Node temp2=head2;
        Node prev1=null;
        Node next1=null;
        Node prev2=null;
        Node next2=null;
        int carry=0,sum=0;
        while(temp1!=null){
            next1=temp1.next;
            temp1.next=prev1;
            prev1=temp1;
            temp1=next1;
        }
        head1=prev1;
        Node current1=head1;
       while(temp2!=null){
            next2=temp2.next;
            temp2.next=prev2;
            prev2=temp2;
            temp2=next2;
        }
        head2=prev2;
        Node current2=head2;
        Node tempHead=null;
        Node newHead=null;
        while(current1!=null || current2!=null){
            if(current1!=null && current2!=null){
               sum=carry+current1.data+current2.data;
               current1=current1.next;
               current2=current2.next;
            }
            else if(current1!=null && current2==null){
                sum=carry+current1.data;
                current1=current1.next;
            }
            
            else{
               sum=carry+current2.data;
               current2=current2.next;
            }
            carry=(sum>=10?1:0);
            sum=sum%10;
            Node data=new Node(sum);
            if(newHead==null){
                newHead=data;
                tempHead=data;
            }
            else{
                tempHead.next=data;
                tempHead=data;
            }
            
          }
          if(carry > 0){
              Node carryNode = new Node(1);
              tempHead.next = carryNode;
          }
          Node prev3=null;
          Node next3=null;
          while(newHead!=null){
            next3=newHead.next;
            newHead.next=prev3;
            prev3=newHead;
            newHead=next3;
        }
        newHead=prev3;
        return newHead;
    
    }
    
}
