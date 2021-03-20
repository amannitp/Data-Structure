import java.util.*;
public class Operator2 {
    public static void main(String[] args) {
        
    
    int x=10;
     final int y=20;
    int z=++10;
    x=++(++y);
    y++;
    boolean check=true;
    check++;
    System.out.println(z);
    System.out.println(x);
    System.out.println(y);
    System.out.println(check);
    }
}
// incremrnt and decrement operator is applicable only for variableif we apply on constant then we will get compile time error 
// nesting of increment and decrement operator is not allowed. if we apply then we get compile time error 
// for final variable we cannot aply increment or decrement operator.
//we can apply increment and decrement operator only for primitive data type we cannnot apply for any other data type