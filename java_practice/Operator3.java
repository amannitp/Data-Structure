import java.util.*;
public class Operator3 {
    public static void main(String[] args) {
    byte b=10;
    byte c=38;
    byte z=20;
    b=(byte)(b+1);
    c=(byte)(c+1);
    System.out.println(b);
    System.out.println(c);
    System.out.println(++z);
        
    }
}
//if we apply arthemetic operation on two variable then result is always Max(int ,typeof a,typeof b);
// so we may be need type casting in this arithmetic operation 
// but in case of increment and decrement operator we need not typecasting ,typecasting occurs internally in decremnent and increment operator