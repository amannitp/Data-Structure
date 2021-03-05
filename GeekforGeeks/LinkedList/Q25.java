public class Q25 {
    int intersectPoint(Node head1, Node head2)
	{ 
	    Node temp1=head1;
	    Node temp2=head2;
	    int count1=0;
	    int count2=0;
	    int d=0;
	    while(temp1!=null){
	        count1++;
	        temp1=temp1.next;
	    }
	     while(temp2!=null){
	        count2++;
	        temp2=temp2.next;
	    }
	    if(count1>count2)
	       d=count1-count2;
	   else
	   d=count2-count1;
	   
	   Node current1=head1;
	   Node current2=head2;
	   if(count1>count2){
	       for (int i = 0; i < d; i++) { 
            if (current1 == null)  
                return -1;
                current1=current1.next;
            }
	   }
        else{
            for (int i = 0; i < d; i++) { 
            if (current2 == null)  
                return -1; 
             current2=current2.next;
        }
	   }
	   while(current1!=null && current2!=null){
	       if(current1==current2)
	          return current1.data;
	          
	        current1=current1.next;
	        current2=current2.next;
	   }
	   return -1;
	    
         // code here
	}
    
}
