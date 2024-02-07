import java.util.*;
import java.lang.*;

class name{
    String first_name;
    String last_name;
    name(String f , String l)
    {
        first_name=f;
        last_name=l;
    }
};

class fullname{
    String f;
};

public class pr8_1 {
    static fullname set(name n){
        fullname f = new fullname();
        f.f=n.first_name+" "+n.last_name;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String f_name = sc.nextLine();

        System.out.print("Enter Last Name : ");
        String l_name = sc.nextLine();

        name n = new name(f_name, l_name);
        fullname f = new fullname();
        f = set(n);

        System.out.println(f.f);
    }
    
}