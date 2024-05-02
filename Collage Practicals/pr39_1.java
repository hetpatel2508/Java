import java.util.ArrayList;

public class pr39_1 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Display the elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }

        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // Check if an element exists in the ArrayList
        int searchItem = 20;
        if (list.contains(searchItem)) {
            System.out.println(searchItem + " is present in the ArrayList.");
        } else {
            System.out.println(searchItem + " is not present in the ArrayList.");
        }

        // Remove an element from the ArrayList
        int removedItem = 20;
        if (list.remove(Integer.valueOf(removedItem))) {
            System.out.println(removedItem + " is removed from the ArrayList.");
        } else {
            System.out.println(removedItem + " is not present in the ArrayList.");
        }

        // Display the updated elements of the ArrayList
        System.out.println("Updated elements in the ArrayList:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
