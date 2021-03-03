public class Q22 {
    ublic static Node sortedInsert(Node head,int data)
         {
             
             Node toAdd=new Node(data);
             Node temp=head.next;
             Node prev = head;
             Node headCheck = head;
             
             if(head == null){
                 toAdd.next = toAdd;
                 return toAdd;
             }
            
             if(head.data > data){
                 toAdd.next=head;
                 head = toAdd;
                 while(prev.next != headCheck){
                      prev=prev.next;
                 }
                 prev.next=head;
                 return head;
             }
             
             while(temp!=head){
                 if(temp.data > data){
                    toAdd.next = prev.next;
                    prev.next = toAdd;
                    return head;
                 }
                 prev =temp;
                 temp=temp.next;
             }
             
             if(prev.data <= data ){
                 toAdd.next = head;
                 prev.next = toAdd;
             }
              
             return head;
            //add code here.
            
         }
    
}
