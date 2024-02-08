import java.util.*;

class compare{
    void comp_num(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        a=sc.nextInt();
        System.out.print("Enter Num2 : ");
        b=sc.nextInt();
        
        if(a==b)
        System.out.println("Same Numbers");
        else if(a>b)
        System.out.println(a+" is bigger");
        else
        System.out.println(b+" is bigger");

        sc.close();
    }
};

class pr1_2{
    public static void main(String[] args) {
        compare c1 = new compare();
        c1.comp_num();
    }
}