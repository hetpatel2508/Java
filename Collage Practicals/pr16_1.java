public class pr16_1 {
    int mult(int a){
        return a*a;
    }
    int mult(int a,int b){
        return a*b;
    }
    int mult(int a,int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        pr16_1 obj = new pr16_1();
        System.out.println("Square of 5 = "+obj.mult(5));
        System.out.println("Multiplication of 5 & 4 = "+obj.mult(5,4));
        System.out.println("Multiplication of 5 & 4 & 3 = "+obj.mult(5,4,3));
    }
}
