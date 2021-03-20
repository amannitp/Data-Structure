import java.util.*;
public class var_arg3 {
    public static void m2(int ...x){
        System.out.println("int...");
    }
    public static void m1(int []x) {
        System.out.println("int[]");
    }
    public static void main(String[] args) {
        m1(new int []{10,20,30});
        m2();
        
    }
    
}
