final class school {
    final int id;
    final String name;

    school(int i, String n) {
        id = i;
        name = n;
    }

    final void output() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
    }
}

public class pr18_1 {
    public static void main(String[] args) {
        school obj = new school(30273, "Het Patel");
        obj.output();
    }
}