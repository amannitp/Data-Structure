public class Q13 {
   public static Node findIntersection(Node head1, Node head2)
    {    
        Node temp1=head1;
        Node temp2=head2;
        Node newHead=null;
        Node tempData = null;
         
         while(temp2!=null && temp1!= null){
             if(temp2.data == temp1.data){
                 if(newHead == null){
                    Node data=new Node(temp1.data);
                    newHead=data;
                    tempData=data;
                 }else{
                     Node data=new Node(temp1.data);
                     tempData.next=data; 
                     tempData=data;
                     
                 }
                 temp1 = temp1.next;
                 temp2 = temp2.next;
             }
             else if( temp2.data < temp1.data){
                 temp2 = temp2.next;
             }
             else{
                 temp1 = temp1.next;
             }
         }
        
        return newHead;
        // code here.
    }
}
    

