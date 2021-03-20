import java.util.*;
public class PowerOfNumber {
    static int stepCount;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter two Number");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println(power(a,b));
        System.out.println("stepcount is : "+stepCount);
        
    }
    static long power(int a,int b){
        stepCount++;
        if(b==0)
        return 1;
        return a*power(a,b-1);
    }
    
}
