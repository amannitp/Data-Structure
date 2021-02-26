public class Q6 {
	Node sortedList(Node head)
	{
	    Node temp=head.next;
	    Node prev=head;
	    while(temp!=null ){
	        if(temp.data < 0){
	            prev.next=temp.next;
	            temp.next=head;
	            head=temp;
	            temp=prev.next;
	            
	        }
	        else{
	            prev=temp;
	            temp=temp.next;
	        }
	    }
	    return head;
		// Your code here
	}
}
    

