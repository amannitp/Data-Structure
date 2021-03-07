public class Q27 {
    Node removeDuplicates(Node root)
    {
        Node temp=root;
        Node temp2=root;
        int check=temp.data;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data){
            temp.next=temp.next.next;
            }
            else
                temp = temp.next;
            
        }
      return root;
	// Your code here	
    }
    
}
