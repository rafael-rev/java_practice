// Main class, name matching program file name
public class Loop2D {
    // basic public function declaration
    public static void main(String[] args){
        // Declare 2 integers
        int i,j;
        // Loop over both integers while j is greater than i
        // i increments and j decrements per iteration
        // print each variable value and their product for each iteration
        for(i=0,j=10;i<j;i++,j--)System.out.println("i is "+i+" and j is "+j +" and product is "+(i*j));
    }
}
