class school {

    int id; // Default
    private String name;
    protected int p_num;

    school(int i, String n, int p) {
        id = i;
        name = n;
        p_num = p;
    }

    String getName() {
        return name;
    }

    int getPnum() {
        return p_num;
    }

};

class teacher extends school {
    public int teacher_id;
    public String teacher_subject;

    teacher(int i, String n, int p, int t_id, String t_sub) {
        super(i, n, p);
        teacher_id = t_id;
        teacher_subject = t_sub;
    }
};

public class pr11_1 {
    public static void main(String[] args) {
        teacher obj = new teacher(30273, "Het Patel", 989898989, 71, "Bharat Patel");
        System.out.println("Id = " + obj.id);
        System.out.println("Name = " + obj.getName());
        System.out.println("Phone Number = " + obj.getPnum());
        System.out.println("Class Teacher Id = " + obj.teacher_id);
        System.out.println("Class Teacher Name = " + obj.teacher_subject);
    }
}
