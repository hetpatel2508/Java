interface teacher{
    public void teach();
}

interface student{
    public void study();
}

class school implements teacher,student{
    public void study(){
        System.out.println("Student is Studying\n");
    }
    public void teach(){
        System.out.println("Teacher is Teaching\n");
     }
}

public class pr20_1 {
    public static void main(String[] args) {
        school obj = new school();
        obj.study();
        obj.teach();
    }
}
