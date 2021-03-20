public class Q10 {
    ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        ArrayList<Integer>result=printInOrder(root,al);
        
        return result;
        // Code
    }
    static ArrayList<Integer>printInOrder(Node root,ArrayList<Integer> al){
        if(root==null)
        return al ;
        al=printInOrder(root.left,al);
        al.add(root.data);
        al=printInOrder(root.right,al);
        return al;
    }
    
}
