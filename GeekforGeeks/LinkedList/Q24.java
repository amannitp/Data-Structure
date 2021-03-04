public class Q24 {
    public static void removeLoop(Node head){
        Node slow=head,fast=head;
         while(fast!=null&&fast.next!=null){
             fast=fast.next.next;
             slow=slow.next;
             if(slow==fast)
             break;
         }
         if(slow!=fast)return;
         slow=head;
         if(fast==head){
             while(fast.next!=slow)
             fast=fast.next;
         }
         else{
             while(fast.next!=slow.next){
                 slow=slow.next;
                 fast=fast.next;
             }
         }
         fast.next=null;
         // code here
         // remove the loop without losing any nodes
     }
    
}
