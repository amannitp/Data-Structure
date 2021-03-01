
    class Q 14{
        
        public Node rotate(Node head, int k) {
            
            Node temp=head;
            
            while(temp.next!=null){
                temp=temp.next;
            }
             temp.next=head;
             temp=head;
            for(int i=1;i<k;i++){
                temp=temp.next;
            }
            head=temp.next;
            temp.next=null;
          return head;
        }
    }
    
    
