public class Q18 {
    nt getMiddle(Node head)
    
    {
        Node fast = head;
        Node slow = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
         // Your code here.
    }
    
}
