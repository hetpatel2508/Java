import java.util.*;

class add{
    void add_num(){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        a=sc.nextInt();
        System.out.print("Enter Num2 : ");
        b=sc.nextInt();
        System.out.print("a+b = "+(a+b));
        sc.close();
    }
};

class pr1_1{
    public static void main(String[] args) {
        add a1 = new add();
        a1.add_num();
    }
}