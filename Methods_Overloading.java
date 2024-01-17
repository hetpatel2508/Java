import java.util.Scanner;

public class Methods_Overloading {

    static int sum(int a,int b){
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;
    }

    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        // Methods_Overloading temp = new Methods_Overloading();
        
        System.out.print("Enter Number 1 : ");
        int num1 =  obj.nextInt();

        System.out.print("Enter Number 2 : ");
        int num2 =  obj.nextInt();

        // System.out.println(num1+" + "+num2+" = "+temp.sum(num1, num2));
        System.out.println(num1+" + "+num2+" = "+sum(num1, num2));
    }
}