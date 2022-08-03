package classes;

// **BASIC CLASS
public class Person {
    // States (AKA: fields, variables, attributes)
    public String name;
    public int health;

    // Barebones Method
    public void heal(int health){
        this.health += health;
    }
    // Constructor: Both Parameters
    public Person(String name, int health){
        this.name = name;
        this.health = health;
    }
    // Constructor: Only name given
    public Person(String name){
        this.name = name;
        this.health = 30;  // a default value since health is not given as param
    }
    // Constructor: No Parameters
    public Person(){
        this.name = "Unknown Soldier";
        this.health = 30;
    }
}