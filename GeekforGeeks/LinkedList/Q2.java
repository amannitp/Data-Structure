public class Q2 {
        public Node moveZeroes(Node head){
           Node zeroHead = null;
           Node dataHead = null;
           Node zerolast = null;
           Node newHead=null;
           Node temp = head;
           Stack<Integer>s=new Stack<Integer>();
            //Your Code here.
            
          while(temp != null){
              if(temp.data == 0){
                  Node zero = new Node(0);
                  if( zeroHead == null){
                      zeroHead = zero;
                      zerolast = zero;
                  }else{
                      zerolast.next = zero;
                      zerolast =zero;
                  }
              }else{ 
                      Node data=new Node(temp.data);
                      if(dataHead==null){
                          dataHead=data;
                          newHead=data;
                      }
                      else{
                      dataHead.next=data;
                      dataHead=data;
                      }
              }
              
              temp = temp.next;
          }
          
          if(zeroHead == null)
             return newHead;
          else{
              zerolast.next = newHead;
              return zeroHead;
          }
            
        }
    }
    

