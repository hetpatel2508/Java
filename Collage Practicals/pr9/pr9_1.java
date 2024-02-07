import java.util.*;
import java.lang.*;

/**
 * Test
 */
public class pr9_1 {
    static int fact(int num)
    {
        if(num>0)
        {
            return num*fact(num-1);
        }
        else
        {
            return 1;
        }
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
            int a = sc.nextInt();
        int ans = fact(a);
        System.out.println("Factorial of "+a+" :"+ans);
    }
}