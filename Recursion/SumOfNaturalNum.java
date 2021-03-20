import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter any Number");
    int n=in.nextInt();
    System.out.println(sum(n));
        
    }
    static int sum(int num){
        if (num==1)
        return 1;
        return sum(num-1)+num;
    }
    
}
