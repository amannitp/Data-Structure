import java.util.*;
public class PowerOfNumber2 {
    static int stepCount=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two Number");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(power(a,b));
        System.out.println("stepcount is: "+stepCount);
        
    }
    static long power(int a,int b){
        stepCount++;
        if(b==0)
        return 1;
        if(b%2==0)
        return power(a*a,b/2);

        return a*power(a,b-1);
    }
    
}