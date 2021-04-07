public class Q11 {
    public static int getSize(Node root)
	{ 
	   int size=0;
	     if(root==null)
	        return 0;
	    int leftSize=0,rightSize=0;
	     leftSize=leftSize+getSize(root.left);
	     rightSize=rightSize+getSize(root.right);
	    
	   return leftSize+rightSize+1;
	
	  
//add Code here.
    }
    
}
