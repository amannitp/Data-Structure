public class Q20 {
    public int rightLeafSum(Node root)
    { 
     if(root==null)
      return 0;
      int sum=0;
      if(root.right!=null)
      {
          if(root.right.right==null && root.right.left==null)
          sum=root.right.data;
      }
      return (sum+rightLeafSum(root.left)+rightLeafSum(root.right));
   }
    
}
