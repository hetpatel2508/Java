public class pr23_1 {
    static double division(double a, double b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by 0 not allowed");
            } else {
                return a / b;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error = " + e);
            return 0; 
        }
    }

    public static void main(String[] args) {
        double a = 2;
        double b = 4;
        double c = 0;
        System.out.println("2/4 = " + division(a, b));
        System.out.println("2/0 = " + division(a, c));
    }
}
