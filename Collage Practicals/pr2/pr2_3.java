import java.util.*;

class Leap{
    String leap_num(int a){
        if(a%4 == 0)
        return ("Leap Year");
        else
        return ("Not Leap Year");
        
    }
};

class pr2_3{
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        a=sc.nextInt();
        sc.close();
        
        Leap a1 = new Leap();
        String ans=a1.leap_num(a);
        System.out.println(ans);
    }
}