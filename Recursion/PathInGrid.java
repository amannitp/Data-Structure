import java.util.*;
public class PathInGrid {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter row and column");
        int r=in.nextInt();
        int c=in.nextInt();
        System.out.println(path(r,c));
        
    }
    static int path(int r,int c){
        if(r==1 || c==1)
           return 1;
        return path(r,c-1)+path(r-1,c);
    }
    
}
