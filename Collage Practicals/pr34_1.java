import java.io.*;

public class pr34_1 {

    public static void main(String[] args) {
        try {
            // Source and destination file paths
            String sourceFilePath = "source.txt";
            String destinationFilePath = "destination.txt";

            // Copy contents from source file to destination file
            try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))
                ) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine(); // Add newline character after each line
                }
            }

            // Display success message
            try (BufferedReader reader = new BufferedReader(new FileReader(destinationFilePath))) {
                String temp;
                // Read each line from the file and print it
                while ((temp = reader.readLine()) != null) {
                    System.out.println(temp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
 Output:

    => in source.txt

        Name : Patel Het Rajeshkunar
        Enrollment Number : 22BECE30273
        Course : Computer Engineering 
        Division : D
        
        => in destination.txt        
        Name : Patel Het Rajeshkunar
        Enrollment Number : 22BECE30273
        Course : Computer Engineering 
        Division : D
        
 */