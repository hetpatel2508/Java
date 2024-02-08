import java.lang.String;

class school{
    int id;
    String name;

    school(int i,String n)
    {
        id=i;
        name=n;
    }

};

public class pr4_1 {
    static void output(school[] temp)
    {
        for(int i=0;i<temp.length;i++)
        {
            System.out.println("Id = "+temp[i].id+"  Name = "+temp[i].name);            
        }

    }
    public static void main(String[] args) {
        school[] s = {
            new school(1,"Het"),
            new school(2,"Urvish"),
            new school(3,"Deep"),
            new school(4,"Dev"),
            new school(5,"Sahil")
        };
        output(s);
    }    
}