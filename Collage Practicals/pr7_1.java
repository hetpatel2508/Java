import java.util.*;
import java.lang.*;

class num{
    int a,b;

    num(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void swap(num t)
    {
        int temp;
        temp=t.a;
        t.a=t.b;
        t.b=temp;
    }
};

class pr7_1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a : ");
        int a=sc.nextInt();
        System.out.print("Enter b : ");
        int b=sc.nextInt();
        num n1 = new num(a, b);
        System.out.println("before swap");
        System.out.println("a = "+n1.a + "  " + "b = " + n1.b);
        n1.swap(n1);
        System.out.println("after swap");
        System.out.println("a = "+n1.a + "  " + "b = " + n1.b);
    }
}