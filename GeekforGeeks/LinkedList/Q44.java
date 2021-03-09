public class Q44 {
    boolean isCircular(Node head)
    { 
        Node temp=head;
        while(temp.next!=null){
            if(temp.next==head)
            return true;
            temp=temp.next;
        }
        return false;
	// Your code here	
    }
    
}
