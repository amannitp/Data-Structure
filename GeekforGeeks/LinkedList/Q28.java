public class Q28 {
    public static int getCount(Node head)
    { 
      Node temp=head;
      int count=0;
      while(temp!=null){
          count++;
          temp=temp.next;
       }
       return count;
      }
    
    
    
}
