public class Q34 {
    Node deleteNode(Node head, int x)
    {
        Node prev=null;
        Node temp=head;
        Node temp3=head;
        int count=2;
        
        if(x ==  1){
            return temp.next;
        }
       
        while(temp != null){
                if( x == count){
                 if(temp.next != null)
                    temp.next = temp.next.next;
                 else
                    temp.next = null;
                    
                 return head;
                }
                  
                temp = temp.next;
                count++;
                    
        }
        return head;
    
}
