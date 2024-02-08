import java.lang.String;

class school{
    int id;
    String name;

    school(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    void output()
    {
            System.out.println("Id = "+this.id+"  Name = "+this.name);            
    }
};

public class pr5_1 {
    public static void main(String[] args) {
        school s = new school(1,"Het");
        s.output();
    }    
}