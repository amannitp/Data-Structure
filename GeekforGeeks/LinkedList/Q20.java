public class Q20 {
    public static int moduarNode(Node head, int k)
    {   
       int count=0;
       Node temp=head;
       Node prev=null;
       Node next=null;
       while(temp!=null){
           next=temp.next;
           temp.next=prev;
           prev=temp;
           temp=next;
           count++;
       }
       head=prev;
       Node temp2=head;
       while(temp2!=null){
           if(count%k==0)
              return temp2.data;
            
           count--;
           temp2=temp2.next;
       }
       return -1;
        // add your code here
    }
    
}
