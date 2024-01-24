import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    int number;

    Student(int id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    void output() {
        System.out.println("Id : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Number : " + this.number + "\n");
    }
}

public class File_Objects {
    public static void main(String[] args) {
        File myFile = new File("File_Objects.txt");
        Student[] s = {
                new Student(1, "het", 999894),
                new Student(2, "sahil", 646314),
                new Student(3, "dev", 784326),
                new Student(4, "deep", 632491),
                new Student(5, "sneh", 846133),
                new Student(6, "smit", 651433)
        };

        // Insertision in File

        try {
            
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(myFile));
            oos.writeObject(s);

            oos.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read From File

        try {

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(myFile));
            Student[] s_temp = (Student[]) ois.readObject();
            ois.close();

            for (Student i : s_temp) {
                i.output();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}