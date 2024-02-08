import java.util.*;
import java.lang.*;

/**
 * Test
 */
public class pr10_1 {
    static void output(int i,int[] arr)
    {
        if(i<arr.length)
        {
            System.out.println("Index : "+i+"  "+"Number : "+arr[i]+"  ");
            output(i+1, arr);
        }
        else
        {
            return;
        }
    }
   public static void main(String[] args) {
        int[] temp = {1,2,3,4,5,6,7};
        output(0, temp); 
   }
}