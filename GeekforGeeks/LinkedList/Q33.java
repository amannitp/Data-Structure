public class Q33 {
    public Node removeDuplicates(Node head) 
    { 
        HashSet<Integer> hs = new HashSet<>();
     
        Node temp = head;
        Node prev = null;
        while (temp != null) 
        {
            
             
            if (hs.contains(temp.data)) {
                prev.next = temp.next;
            } else {
                hs.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    
}
