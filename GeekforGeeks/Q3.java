
    public class Q3 {
        public long multiplyTwoLists(Node l1,Node l2){
              
              Node temp1=l1;
              Node temp2=l2;
              long num1=0;
              long num2=0;
              while(temp1!=null){
                  num1=(num1*10+temp1.data)%(1000000007);
                  temp1=temp1.next;
              }
              while(temp2!=null){
                  num2=(num2*10+temp2.data)%(1000000007);
                  temp2=temp2.next;
              }
              return (num1*num2)%(1000000007);
        }
     }
    

