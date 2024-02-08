class school{

    public int id;
    private String name;
    protected int p_num;

    school(int i,String n,int p)
    {
        id=i;
        name=n;
        p_num=p;
    }

    String getName()
    {
        return name;
    }
    int getPnum()
    {
        return p_num;
    }
    
};

public class pr11_1 {
    public static void main(String[] args) {
        school  s = new school(1, "het",44545127);
        System.out.println("Id = "+s.id);
        System.out.println("Name = "+s.getName());
        System.out.println("Id = "+s.p_num);
    }    
}
