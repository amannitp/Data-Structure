public class Q43 {
    class Solution{
        Node divide(int N, Node head){
            Node temp=head;
            Node tempHeadOdd=null;
            Node newHeadOdd=null;
            Node tempHeadEven=null;
            Node newHeadEven=null;
            Node Head=null;
            while(temp!=null){
                Node data=new Node(temp.data);
                if(temp.data%2!=0){
                    if(tempHeadOdd==null){
                        tempHeadOdd=data;
                        newHeadOdd=data;
                    }
                    else{
                        tempHeadOdd.next=data;
                        tempHeadOdd=data;
                    }
                }
                else{
                    if(tempHeadEven==null){
                        tempHeadEven=data;
                        newHeadEven=data;
                    }
                    else{
                        tempHeadEven.next=data;
                        tempHeadEven=data;
                    }
                }   
             temp=temp.next;   
            }
            if(newHeadEven==null || newHeadOdd==null)
              return head;
            else
              tempHeadEven.next=newHeadOdd;
              return newHeadEven;
            // code here
        }
    
}
