import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_basic {
    public static void main(String[] args) {

        File myFile = new File("testing.txt");

        // creating file :
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("File is not created..:(");
            e.printStackTrace();
        }

        // inserting in file :

        try {
            FileWriter fw = new FileWriter("testing.txt");
            fw.write(" Hello World....:) \n Patel Het Rajeshkumar \n 22BECE30273");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read from the file :
        
        try{
            Scanner sc = new Scanner(myFile);

            while (sc.hasNextLine()) {
                String temp = sc.nextLine();
                System.out.println(temp);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

        // Delete a perticular file

        if(myFile.delete()){
            System.out.println(" File Deleted : "+myFile.getName());
        }
        else{
            System.out.println("There is some problem while deleting the file");
        }
    }
}