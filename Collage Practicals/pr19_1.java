package mypackage1;
public class pr19_1 {
    public static void oddeven(int num){
        if(num%2==0){
            System.out.println(num+" = Even");
        }
        else{
            System.out.println(num+" = Odd");
        }
    }
    public static void main(String[] args) {
        oddeven(55);
    }    
}


/*
 while Compilation :

 step1: javac -d . pr19_1.java  
 step2: java pr19_1.java
 */