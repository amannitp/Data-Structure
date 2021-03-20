public class Q2 {
    static ArrayList<Integer> preorder(Node root)
    { 
         ArrayList<Integer> al=new ArrayList<Integer>();
         printPreorder(root,al);
        
          return al;
        // Code here
    }
    
    static void printPreorder(Node root, ArrayList<Integer> al){
        if(root == null)
           return ;
        
         al.add(root.data);
         printPreorder(root.left,al);
         printPreorder(root.right,al);
    
    }
    
}
