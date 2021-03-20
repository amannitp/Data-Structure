public class Q3 {
    static ArrayList<Integer> preorder(Node root)
    { 
        ArrayList<Integer> result = new ArrayList<Integer>();
        printPreorder(root, result);
        return result;
        // Code here
    }
    
     static void printPreorder(Node root, ArrayList<Integer> result){
        
        if(root!=null){
            result.add(root.data);
            printPreorder(root.left, result);
            printPreorder(root.right, result);
        }
     }
    
}
