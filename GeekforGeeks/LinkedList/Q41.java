public class Q41 {
    public static int count(Node head, int search_for)
    {  
        int count=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==search_for)
            count++;
            temp=temp.next;
        } 
        return count;
    
}
