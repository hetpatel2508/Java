import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pr32_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a Division: ");
        char division = (char) reader.read();
        reader.readLine();
        /*
         It's necessary to consume the newline character (\n) after reading a single character
         because when you press Enter after inputting the character,
         the newline character is also sent to the input stream instead of String
         */

        System.out.print("Enter a Name: ");
        String name = reader.readLine();

        System.out.println("Name : " + name);
        System.out.println("Division: " + division);

        reader.close();
    }
}

/*
 Output:
 
    Enter a Division: D
    Enter a Name: Het Patel
    Name : Het Patel
    Division: D
 */