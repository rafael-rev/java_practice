// Import Person class
import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        // **ARRAYS
        int[] arr = new int[5];  // Regular empty array of length 5
        int[] arr2 = {3,6,7,9,1,2};  // Regular array of length 6 initialized w/ values
        arr[3] = 7;  // Give value '7' to index 3 of first array
        arr2[2] = 10;  // Change value of index 2 to '10' in second array
        System.out.println(arr2[3]);  // Prints index 3 from arr2 -> 9

        // **MULTIDIMENSIONAL ARRAYS
        int[][] arr2d = new int[3][4]; // empty 2D Array of length 3, whose inner arrays are length 4
        int[][] arr2d2 = {{1,2,3},{4,5,6}}; // 2D Array of length 2, whose inner arrays of length 3 are initialized w/ values
        System.out.println(arr2d2[1][2]);  // Print index 2 from the 2nd inner array -> 6

        // **STRING CLASS CONSTRUCT
        String str = "This is a string";
        System.out.println(str);

        // Initialize new Person objects
        Person mary = new Person("Mary", 25);  // Both params
        Person joe = new Person("Joe");  // Only name param
        Person ghost = new Person();  // No params
        System.out.println("Names: " +mary.name+ ", "+ joe.name+ ", "+ghost.name);
        System.out.println("Everyone's health sum: " + (mary.health + joe.health + ghost.health));
    }
}
