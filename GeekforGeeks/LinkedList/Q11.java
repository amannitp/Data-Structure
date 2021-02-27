public class Q11 {
    public static Node reverseDLL(Node  head)
{    
   Node temp=head;
   Stack<Integer>s=new Stack<Integer>();
   while(temp!=null){
       s.push(temp.data);
       temp=temp.next;
   }
   temp=head;
   while(temp!=null){
       temp.data=s.pop();
       temp=temp.next;
   }
   return head;
  } 
    
}
