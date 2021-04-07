public class Q16 {
    int countLeavesNode=0;
    int countLeaves(Node root) 
    {   
       preorder(root);
       return countLeavesNode;
       
    }
    void preorder(Node root){
        if(root==null)
         return ;
         if(root.left==null && root.right==null)
         countLeavesNode++;
        preorder(root.left);
        preorder(root.right);
        
    }
    
}
