class Dog {

    private int age;
    private String Name;

    Dog(){
        this(2,"Gollu");
    }

    Dog(int age, String Name){
        this.age=age;
        this.Name=Name;
    }
    
    void output(){
        System.out.println("Name : "+this.Name);
        System.out.println("Age : "+this.age+"\n\n");
    }
}

public class this_reference {
    public static void main(String[] args) {

        Dog d2 = new Dog();
        Dog d1 = new Dog(15,"Charly");

        d1.output();
        d2.output();


       /*
        this reference refers to the current object of a class you are working with

        with use of this we can set values of variables of class
        using constructor, setter , getter , deafault constructor

        we can only use this reference at specific positions only 
        */

    }
}