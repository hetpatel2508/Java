public class StringBuffer_methods {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Het");

        System.out.println(s1.capacity());

        s1.append(" Patel");
        System.out.println(s1+"\n");    //will apend mentioned string
        
        s1.appendCodePoint(3);
        System.out.println(s1+"\n");    //will append special symbols using their codes
        
        System.out.println(s1.codePointAt(1));
        System.out.println(s1.codePointBefore(6)+"\n");//return ASCCI code at particullar position
        
        
        System.out.println(s1.codePointCount(2, 6));  //retunr number of characters between start to end
        
        s1.delete(3, 9);
        System.out.println(s1+"\n");

        s1.deleteCharAt(3);
        System.out.println(s1+"\n");

        s1.insert(3, " Patel");
        System.out.println(s1+"\n");

        if(!s1.isEmpty()){System.out.println("String is not empty\n");}

        s1.replace(4, 9, "Rajeshkumar");
        System.out.println(s1+"\n");

        s1.reverse();
        System.out.println(s1+"\n");
        s1.reverse();

        String s;

        // s=s1;  this will give error because String & StringBuffer are different type thus we use,,,,

        s=s1.toString();
        System.out.println(s+"\n");



        /*
            Why to use StringBuffer then normal String: 
                StringBuffer will increase the size or capacity of containing element evry times
            new element is inserted but in normal string after every insertision the size of string 
            won't be increasing.
                there are some extra functionality availabele in StringBufffer like append, insert,capacity
            Which are not usully available in normal type of String
         */
    }
}