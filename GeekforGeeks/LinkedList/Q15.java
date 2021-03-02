public class Q15 {
   long DecimalValue(Node head)
   {
 	double num=0;
 	int count=0;
 	Node temp=head;
 	Node temp2=head;
 	while(temp2!=null){
 	    count++;
 	    temp2=temp2.next;
 	}
 	while(temp!=null){
 	 num=(num+temp.data*(Math.pow(2,--count)%1000000007))%1000000007;
 	 temp=temp.next;
 	}
 	return (long)num;
   }
}
    

