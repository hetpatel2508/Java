abstract class shape {
    abstract double area();     

    void display(){
        System.out.println("This is a shape.");
    }
}

class circle extends shape{
    double radius;

    circle(double r){
        radius=r;
    }

    // @Override
    double area(){
        return Math.PI*radius*radius;
    }
}
 
public class pr21_1 {
    public static void main(String[] args) {
        circle obj = new circle(2.000);

        System.out.println("Radius = "+obj.radius);
        System.out.println("Area = "+obj.area());

        obj.display();
    }
}
