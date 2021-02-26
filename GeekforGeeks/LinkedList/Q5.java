public class Q5 {
	Node sortedList(Node head)
	{
	    Node temp=head;
	    Node tempHead=null;
	    Node newHead=null;
	    while(temp!=null){
	        Node data =new Node(temp.data);
	        if(newHead==null){
	            data.next=newHead;
	            newHead=data;
	            tempHead=data;
	        }
	        else if(tempHead.data<=temp.data){
	                tempHead.next=data;
	                tempHead=data;
	        }
	        else{
	            data.next=newHead;
	            newHead=data;
	        }
	        temp=temp.next;
	    }
	    return newHead;
		// Your code here
	}
}

