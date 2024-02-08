import java.util.*;
import java.lang.*;

class pr6_1{
    void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        System.out.println("before swap");
        System.out.println("a = "+a + "  " + "b = " + b);
        System.out.println("after swap");
        System.out.println("a = "+a + "  " + "b = " + b);
    }
}