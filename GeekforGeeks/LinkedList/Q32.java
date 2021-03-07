public class Q32 {
    void printList(Node head)
    { 
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    
}
