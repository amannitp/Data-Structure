public class q10 {
    boolean isPalindrome(Node head) 
    { 
        Node temp=head;
        Node temp2=head;
        Stack<Integer> s=new Stack<Integer>();
        
        while(temp!=null){
            s.push(temp.data);
            temp=temp.next;
        }
        while(temp2!=null){
            
            if(temp2.data!=s.pop())
             return false;
             temp2=temp2.next;
        }
        return true;
        //Your code here
    }    
}

    

