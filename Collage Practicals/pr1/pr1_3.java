import java.util.*;

class Leap{
    void leap_num(){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year : ");
        a=sc.nextInt();
        if(a%4 == 0)
        System.out.print("Leap Year");
        else
        System.out.print("Not Leap Year");

        sc.close();
    }
};

class pr1_3{
    public static void main(String[] args) {
        Leap a1 = new Leap();
        a1.leap_num();
    }
}