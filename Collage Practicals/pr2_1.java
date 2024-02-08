import java.util.*;

class add{
    int add_num(int a,int b){
        return a+b;
    }
};

class pr2_1{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        a=sc.nextInt();
        System.out.print("Enter Num2 : ");
        b=sc.nextInt();
        sc.close();
        
        add a1 = new add();
        int answer = a1.add_num(a,b);
        System.out.println("a+b : "+answer);
    }
}