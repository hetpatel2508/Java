import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

    System.out.println("Method-1 for Array: ");

        int[] a1;
        a1 = new int[5];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;

        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i]);
        }

    System.out.println("\nMethod-2 for Array: ");

        int[] a2 = new int[5];
        a2[0] = 1;
        a2[1] = 2;
        a2[2] = 3;
        a2[3] = 4;
        a2[4] = 5;

        for (int ele : a2) {
            System.out.print(ele);
        }
        
    System.out.println("\nMethod-2 for Array: ");
        
        int[] a3={2,4,6,8,10};
        
        for (int ele : a3) {
            System.out.print(ele);
        }
    }
}