import java.util.*;
public class main_method2 {
    public static void main(String[] args) {
        System.out.println("parents main");
    }    
}
class c extends main_method2{
    public static void main(String[] args) {
        System.out.println("child main");
        
    }// for main method inheritance and overloading is applicable but overriding concept is not applicable for main methods 
     //instead of overridig methods method hiding is applicable

}
