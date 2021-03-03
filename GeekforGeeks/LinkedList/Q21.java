public class Q21 {
    Node mergeResult(Node node1, Node node2)
    {
        Node temp1=node1;
        Node temp2=node2;
        Node tempHead=null;
        Node newHead=null;
        while(temp1!=null && temp2!=null){
            if(temp1.data>temp2.data){
                if(tempHead==null){
                    tempHead=temp2;
                    newHead=temp2;
                }
                else{
                    tempHead.next=temp2;
                    tempHead=temp2;
                }
                temp2=temp2.next;
                if(temp2==null){
                   tempHead.next=temp1;
                }
            }
            else{
                if(tempHead==null){
                    tempHead=temp1;
                    newHead=temp1;
                }
                else{
                    tempHead.next=temp1;
                    tempHead=temp1;
                }
                temp1=temp1.next;
                if(temp1==null){
                    tempHead.next=temp2;
                }
            }
            
        }
        Node next=null;
        Node prev=null;
        while(newHead!=null){
            next=newHead.next;
            newHead.next=prev;
            prev=newHead;
            newHead=next;
        }
        newHead=prev;
        return newHead;
	// Your code here	
    }
    
}
