import java.util.Scanner;

class student {
    int id;
    String name;

    static class school {
        student s = new student();
        String feesPaid;

        school(int i, String n, String f) {
            s.id = i;
            s.name = n;
            feesPaid = f;
        }

        void output() {
            System.out.println("Id = " + s.id);
            System.out.println("Name = " + s.name);
            System.out.println("Fees = " + feesPaid);
            System.out.println("");
        }
    }
}

public class pr13_1 {
    public static void main(String[] args) {
        
        student.school inner = new student.school(30273, "HetPatel", "Paid");
        inner.output();
        
        student.school inner1 = new student.school(30211, "SahilPatel", "unPaid");
        inner1.output();
    }
}
