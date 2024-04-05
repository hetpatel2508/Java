public class pr17_1 {

    static class school {
        int Enrollment_id;
        String name;

        school(int i, String n) {
            Enrollment_id = i;
            name = n;
        }

        void output() {
            System.out.println("Id = " + Enrollment_id);
            System.out.println("Name = " + name);
        }
    }

    static class student extends school {
        int p_num;

        student(int i, String n, int p) {
            super(i, n);
            p_num = p;
        }

        void output() {
            super.output();
            System.out.println("Phone Number = " + p_num);
        }
    }

    public static void main(String[] args) {
        student obj = new student(30273, "Het Patel", 989898);
        obj.output(); // Call the output method of the student class
    }
}
