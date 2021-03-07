public class Q37 {

    void deleteNode(Node node)
    { 
        int num=node.data;
        node.data=node.next.data;
        node.next.data=num;
        node.next=node.next.next;
         // Your code here
    }
    
}
