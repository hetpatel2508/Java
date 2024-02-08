import java.util.*;

class Compare{
    String comp_num(int a,int b){
        if(a==b)
        return ("Same Number");
        else if(a>b)
        return (a+" is Bigger");
        else
        return (b+" is Bigger");        
    }
};

class pr2_2{
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        a=sc.nextInt();
        System.out.print("Enter Num2 : ");
        b=sc.nextInt();
        sc.close();
        
        Compare a1 = new Compare();
        String ans=a1.comp_num(a,b);
        System.out.println(ans);
    }
}