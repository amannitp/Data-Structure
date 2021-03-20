import java .util.*;
public class var_arg2 {
    public static void m1(int ...x){
        System.out.println("var-arg methods");
    }
     public static void main(String[] args) {
        m1();
        m1(10);
        m1(10,20);
        m1(10,20,30);   
    }
    
}
