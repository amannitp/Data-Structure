public class Q6 {
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
        printPostorder(root, al);
        return al;
       // Your code goes here
    }
    static void printPostorder(Node root,ArrayList<Integer> al){
        if(root!=null){
        printPostorder(root.left,al);
        printPostorder(root.right,al);
        al.add(root.data);
        }
    }
    
}
