public class Q22 {
    boolean hasPathSum(Node root, int S) {
        
        if(root == null) {
            return false;
        }
        return findSum(root, S, 0);
    }
    boolean findSum(Node root, int S, int current_sum){
        if(root == null) {
            return false;
        }
        current_sum += root.data;
        if(current_sum == S && root.left == null && root.right == null) {
            return true;
        }
        return findSum(root.left, S, current_sum) || findSum(root.right, S, current_sum);
    }
    
}
