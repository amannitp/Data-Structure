public class Q31 {
    int getNthFromLast(Node head, int n)
    {  
        int count=0;
        Node temp=head;
        Node temp2=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        for(int i=1;temp2!=null && i<=count;temp2=temp2.next,i++){
           if(i==(count+1-n))
           return temp2.data;
        }
        return -1;
    
}
