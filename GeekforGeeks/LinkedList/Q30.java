public class Q30 {
    int getMiddle(Node head)
    
    {
        int count=0;
        Node temp=head;
        Node temp2=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int check=count/2;
       for(int i=1;temp2!=null && i<count;temp2=temp2.next,i++){
           if(i==(check+1))
           return temp2.data;
       }
       return temp2.data;
    
}
