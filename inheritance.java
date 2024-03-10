
/**
 * Test
 */
class student {
    int id;
    String name;

    student(int i, String n)
    {
        id=i;
        name=n;
    }
};

class teacher extends student {
    int attendance;

    teacher(int a, int i, String n) {
        super(i,n);
        attendance = a;
    }
};

class school extends teacher {
    String fees_Details;

    school(String f, int a, int i, String n) {
        super(a, i, n);
        fees_Details = f;
    }

    void output()
    {
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        System.out.println("Attendance = "+attendance);
        System.out.println("Fees_Details = "+fees_Details);
        System.out.println("");
    }
};

public class inheritance {
    public static void main(String[] args) {
        school s1 = new school("Paid", 50, 30273, "Het");
        s1.output();
    }
}