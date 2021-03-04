public class Q23 {
    public static void removeLoop(Node head){
        Node temp=head;
        HashSet<Node> hs=new HashSet<Node>();
        Node prev=null;
        while(temp!=null){
           
            if(hs.contains(temp)){
                prev.next=null;
                break;
            }
            else
            hs.add(temp);
            prev=temp;
            temp=temp.next;
        }
        // code here
        // remove the loop without losing any nodes
    }
    
}
