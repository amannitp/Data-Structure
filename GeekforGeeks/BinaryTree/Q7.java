public class Q7 {
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        printPostorder(root, al);
        return al;
       // Your code goes here
    }
    static void printPostorder(Node root,ArrayList<Integer> al){
        if(root==null)
        return;
        printPostorder(root.left,al);
        printPostorder(root.right,al);
        al.add(root.data);
    }
    
}
