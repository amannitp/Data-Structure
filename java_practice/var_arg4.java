import java.util.*;
public class var_arg4 {
    public static void m1(int...x){
        System.out.println("var-args methods");
    }
    public static void m1(int x){
        System.out.println("general methods ");
    }
    public static void main(String...args) {
        m1();
        m1(10,20);
        m1(10);
    }
}
