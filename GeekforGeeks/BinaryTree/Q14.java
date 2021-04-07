public class Q14 {
    int countLeaves(Node root) 
    {   int count;
        if(root==null)
          return 0;
        else if(root.left==null && root.right==null)
          return 1;
        else 
          return countLeaves(root.left)+countLeaves(root.right);
    }
    
}
