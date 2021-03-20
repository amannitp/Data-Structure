public class Q4 {
    static ArrayList<Integer> preorder(Node root)
    { 
         ArrayList<Integer> al=new ArrayList<Integer>();
         ArrayList<Integer> result = printPreorder(root,al);
        
          return result;
        // Code here
    }
    
    static ArrayList<Integer> printPreorder(Node root, ArrayList<Integer> al){
        if(root == null)
           return al;
        
        al.add(root.data);
        al= printPreorder(root.left,al);
        al= printPreorder(root.right,al);
        return al;
    }
    
}
