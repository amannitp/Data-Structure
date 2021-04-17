public class Q18 {
    
class GfG
{   int sum=0;
    public int SumofLeafNodes(Node root)
    {   
        printSumofLeafNode(root);
        return sum;
           // your code here
    }
    void printSumofLeafNode(Node root){
        if(root==null)
          return ;
        if(root.left==null && root.right==null)
          sum+=root.data;
        printSumofLeafNode(root.left);
        printSumofLeafNode(root.right);
    }
}
}
