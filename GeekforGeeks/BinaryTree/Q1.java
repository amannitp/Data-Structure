public class Q1 {

	public static int getSize(Node root)
	{ 
	  if(root==null)
	  return 0;
	  return getSize(root.left)+getSize(root.right)+1;
//add Code here.
    }
    
}
