import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pr33_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read a string
        System.out.print("Enter a Name: "); 
        String Name = reader.readLine();
        
        
        
        System.out.print("Enter a Enrollment Number: ");
        String en_num =  reader.readLine();

        System.out.println("Name: " + Name);
        System.out.println("Enrollment Number: " + en_num);

        reader.close();
    }
}

/*
 Output: 
    Enter a Name: Het Patel
    Enter a Enrollment Number: 22BECE30273
    Name: Het Patel
    Enrollment Number: 22BECE30273
 */