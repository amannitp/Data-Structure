public class Q12 {
    static int sumBT(Node root){
        if(root == null){
           return 0;
       }

       int leftSum = 0;
       leftSum += sumBT(root.left);
       
       int rightSum = 0;
       rightSum += sumBT(root.right);
       
       return leftSum + rightSum + root.data;
        
   }
    
}
