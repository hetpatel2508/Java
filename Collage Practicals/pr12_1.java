import java.util.Scanner;

/**
 * Test
 */
class school {
    int id;
    String name;
    static String Course_name;

    school(int i, String n) {
        id = i;
        name = n;
    }

    static {
        Course_name = "Computer Engineering";
    }

};

public class pr12_1
 {

    static String hello = "Hello World";

    public static void main(String[] args) {
           System.out.println(hello); 

           school s1 = new school(1,"Het");
           school s2 = new school(1,"Sahil");

           System.out.println("Id = "+s1.id+"  Name = "+s1.name+" Course Name = "+school.Course_name);
           System.out.println("Id = "+s2.id+"  Name = "+s2.name+" Course Name = "+school.Course_name);
    }
}