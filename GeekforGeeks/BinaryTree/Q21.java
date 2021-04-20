public class Q21 {
    boolean hasPathSum(Node root, int S) {
        
        if (root == null)
            return S == 0;
        return hasPathSum(root.left, S - root.data)
            || hasPathSum(root.right, S -root.data);
        // Your code here
    }
    
}
