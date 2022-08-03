import java.util.Scanner;
import classes.Person;

public class MakePerson {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //System.out.println("Enter ID for new Person: ");
        //String id1 = scn.nextLine();

        System.out.println("Enter Name and Health for that Person: ");
        String name = scn.nextLine();
        int health = scn.nextInt();
        scn.close();

        Person id1 = new Person(name,health);

        System.out.println("New Person "+id1.name+ " has "+id1.health+ " health!");
    }
}
