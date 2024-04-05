class MyException extends Exception {
    public MyException(String e) {
        super(e);
    }
}

public class pr24_1 {

    static void validate(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            validate(20); 
            validate(15); 
        } catch (MyException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}