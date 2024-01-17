import java.util.Scanner;

public class Math_Class {
    public static void main(String[] args) {
        int x=5;
        int y=8;
        System.out.println("Smaller value : " + Math.min(x, y));
        System.out.println("Maximum value : " + Math.max(x, y));
        System.out.println("Round value : " + Math.round(2.246)); //will remove digits after .

        int t1=25;
        System.out.println("SquareRoot of 25 = " + Math.sqrt(t1));
        
        int t5=125;
        System.out.println("CubeRoot of 125 = " + Math.cbrt(t5));

        int t2= -25;
        System.out.println("Working of abs : " + Math.abs(t2));

        int t3 = (int)(Math.random() * 100);
        System.out.println("Rendom Number = " + t3);

        int t4 = (int)(Math.random() * 100000);
        System.out.println("Rendom Number = " + t4);

        System.out.println("Power of 2^4 : " + Math.pow(2, 4));
    }
}