public class Q19 {
    int sum=0;
    public int rightLeafSum(Node root)
    {
        printRightLeafSum(root);
        return sum;
      //add code here.
   }
   void printRightLeafSum(Node root){
       if(root==null)
         return ;
        if(root.right!=null){
         if( root.right.left==null && root.right.right==null ){
          sum=sum+root.right.data;
         }
        }
        printRightLeafSum(root.left);
        printRightLeafSum(root.right);
   }
    
}
