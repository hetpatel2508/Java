import java.util.Scanner;

class Employee{
    int id;
    String name;
    int salary;

    Employee(int i , String n , int s){
        id=i;
        name=n;
        salary=s;
    }

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    int getSalary(){
        return salary;
    }

    void output(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary+"\n");
    }
}

public class Class_Object {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"het",50000);
        e1.output();

        Employee[] emp={
                new Employee(1, "het", 24500),
                new Employee(2, "sahil", 20500),
                new Employee(3, "dev", 19500),
                new Employee(4, "deep", 18500),
                new Employee(5, "urvish", 17500)
        };

        for(Employee obj : emp){
            obj.output();
        }

        //or

        // for(int i=0; i < emp.length ; i++){
        //     emp[i].output();
        // }
  
    }
}