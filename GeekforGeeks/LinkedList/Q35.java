public class Q35 {
    Node sortedMerge(Node headA, Node headB) {
        Node head=null,tail=null;
       while(headA!=null&&headB!=null){
           if(headA.data<=headB.data){
               if(head==null){
                   head=headA;
                   tail=headA;
               }
               else{
                   tail.next=headA;
                   tail=headA;
               }
               headA=headA.next;
           }
           else{
               if(head==null){
                   head=headB;
                   tail=headB;
               }
               else{
                   tail.next=headB;
                   tail=headB;
               }
               headB=headB.next;
           }
       }
       while(headA!=null){
           tail.next=headA;
           tail=headA;
           headA=headA.next;
       }
       while(headB!=null){
           tail.next=headB;
           tail=headB;
           headB=headB.next;
       }
       return head;
    
}
