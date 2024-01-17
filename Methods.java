import java.util.Scanner;

public class Methods {

    static String oddEven(int num){
        if (num % 2 == 0) {
            return "Even";
        } 
        else {
            return "Odd";
        }
        
    }

    String OE(int num){
        if (num % 2 == 0) {
            return "Even";
        } 
        else {
            return "Odd";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num1 = sc.nextInt();    

        //now calling method defined above
        
        String Result = oddEven(num1);
        
        System.out.println(num1+" is "+Result);
        
        //or
        
        Methods obj=new Methods();
        String Res = obj.OE(num1);
        
        System.out.println(num1+" is "+Res);
        
        sc.close();
    }
}