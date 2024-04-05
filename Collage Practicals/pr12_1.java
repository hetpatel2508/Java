public class pr12_1
{
     static class Temp{
         static String collage_name;
         static String course_name;

         static{
            collage_name="LDRP ITR";
            course_name="Computer Engineering";
         }

         static void display(){
             System.out.println("Collage Name = "+collage_name);
             System.out.println("Course Name = "+course_name);
         }
     }; 
    public static void main(String[] args) {
        
        System.out.println("For All Student : \n\n");
        System.out.println("Collage Name = "+Temp.collage_name);
        System.out.println("Course Name = "+Temp.course_name);

        System.out.println("\nOR\n");

        Temp obj = new Temp();
        obj.display();
    }
}