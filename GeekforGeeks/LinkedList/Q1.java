class Q1
{
    static Node segregate(Node head)
    {  
        Node temp=head;
        int count0=0;
        int count1=0;
        int count2=0;
        Node newHead=head;
        Node Head=head;
        
        while(temp!=null){
            if(temp.data==0){
                count0++;
            }
            else if(temp.data==1){
                count1++;
            }
            else
            count2++;
            
            temp=temp.next;
        }
        for(int i=0;i<count0;i++){
            newHead.data=0;
            newHead=newHead.next;
        }
        for(int i=0;i<count1;i++){
            newHead.data=1;
            newHead=newHead.next;
        }
        for(int i=0;i<count2;i++){
            newHead.data=2;
            newHead=newHead.next;
        }
            
        return Head;
        // add your code here
    }
}