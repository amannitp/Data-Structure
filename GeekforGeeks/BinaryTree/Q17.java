public class Q17 {
    int countLeavesNode=0;
    int countLeaves(Node root) 
    {   
       postorder(root);
       return countLeavesNode;
       
    }
    void postorder(Node root){
        if(root==null)
         return ;
         
        postorder(root.left);
        postorder(root.right);
        if(root.left==null && root.right==null)
         countLeavesNode++;
        
    }
    
}
