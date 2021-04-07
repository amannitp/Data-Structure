public class Q15 {
    int countLeavesNode=0;
    int countLeaves(Node root) 
    {   
       inorder(root);
       return countLeavesNode;
       
    }
    void inorder(Node root){
        if(root==null)
         return ;
        inorder(root.left);
        if(root.left==null && root.right==null)
         countLeavesNode++;
        
        inorder(root.right);
        
    }
    
}
