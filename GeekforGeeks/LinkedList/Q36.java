public class Q36 {
    public static Node findUnion(Node head1,Node head2)
	{
	    Node temp1=head1;
	    Node temp2=head2;
	    while(temp1.next!=null){
	        temp1=temp1.next;
	    }
	    temp1.next=head2;
	    Node current1=head1;
	    Node newHead=head1;
	    TreeSet<Integer> ss = new TreeSet<Integer>();
	    
	    while(current1!=null){
	        ss.add(current1.data);
	        current1=current1.next;
	    }
	  
	    Iterator iterator = ss.iterator();
	    Node prev=newHead;
	    while(iterator.hasNext()){
	        newHead.data=(int)iterator.next();
	        prev=newHead;
	        newHead=newHead.next;
	    }
	    prev.next = null;
	    return head1;
    
}
