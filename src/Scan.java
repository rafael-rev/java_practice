import java.util.Scanner;

public class Scan {
    public static void main(String[] args){
        // Create a Scanner object to use for input, which is designated by "System.in"
        Scanner scanObj = new Scanner(System.in);

        System.out.println("Type name and power level: ");
        // .nextLine() waits for input according to the type
        String name = scanObj.nextLine();
        // the entered type for .nextInt MUST be Int, or else exception
        int power = scanObj.nextInt();

        System.out.println(name + " has power level of "+power);
    }
}
