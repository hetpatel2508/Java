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
    String fees_Details;

    teacher(int a, int i, String n,String f) {
        super(i,n);
        attendance = a;
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


public class pr15_1 {
    public static void main(String[] args) {
        teacher s1 = new teacher(50, 30273, "Het Patel","Paid");
        s1.output();
    }
}