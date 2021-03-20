public class Q8 {
    int height(Node node) {
        if(node == null)
         return 0;
        int leftHeight = height(node.left)+1;
        int rightHeight = height(node.right)+1;
        return Math.max(leftHeight,rightHeight);
    }
    
}
