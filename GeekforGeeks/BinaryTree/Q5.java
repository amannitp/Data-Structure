public class Q5 {
    ArrayList<Integer> postOrder(Node root)
    {
        ArrayList<Integer>al=new ArrayList<Integer>();
         ArrayList<Integer>result=printPostorder(root, al);
        return al;
       // Your code goes here
    }
    static ArrayList<Integer> printPostorder(Node root,ArrayList<Integer> al){
        if(root==null)
          return al;
        al=printPostorder(root.left,al);
        al=printPostorder(root.right,al);
        al.add(root.data);
        return al;
    }
    
}
