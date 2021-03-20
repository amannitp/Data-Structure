public class Q9 {
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        printInOrder(root,al);
        
        return al;
        // Code
    }
    static void printInOrder(Node root,ArrayList<Integer> al){
        if(root==null)
        return ;
        printInOrder(root.left,al);
        al.add(root.data);
        printInOrder(root.right,al);
        
    }
    
    
}
