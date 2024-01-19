public class String_methods {
    public static void main(String[] args) {
        
        String n = "\nHetPatelR";

        System.out.println(n+"\n");
        
        System.out.println("Length : "+n.length()+"\n");
        
        System.out.println("In UpperCase : "+n.toUpperCase());
        System.out.println("In LowerCase : "+n.toLowerCase()+"\n");

        String temp1="      Het";
        System.out.println("Trimmed String : "+temp1.trim()+"\n"); //will remove blank spaces in front

        String temp2="HetPatel";
        System.out.println("Substring : "+temp2.substring(3));
        //or
        String temp3="HetPatelRajeshkumar";
        System.out.println("Substring : "+temp3.substring(3, 8)+"\n");
        
        
        String temp4="HetPatelRajeshkumar";
        System.out.println("Replace Character in String : "+temp4.replace("Patel", "Patidar")+"\n");

        Boolean temp5=temp4.startsWith("Het");
        if(temp5){System.out.println("String is starting with het\n");}
        
        Boolean temp6=temp4.endsWith("Kumar");
        if(temp6){System.out.println("String is ending with kumar\n");}

        System.out.println("Character at position 3 is : "+temp4.charAt(3)+"\n");

        System.out.println("Index of Patel in String is : "+temp4.indexOf("Patel")+"\n");
        
        System.out.println("Index of Rajeshkunar From Patel in String is : "+temp4.indexOf("Rajeshkumar",3)+"\n");
        
        System.out.println("Last Index of e in String is : "+temp4.lastIndexOf("e")+"\n"); //will return the last used e

        

    }
}