
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(); // 
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        print("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);
        
        

        print("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) { //calling the arraylist created in the main method and two int variables as parameter for this method.
        for(int number : numbers) { //for eeach number is arraylist numbers
            if (number >= lowerLimit && number <= upperLimit) { // if 
                puts(number);
            }
        }
    }
    public static void print(String word){ //created a method called "print" to print strings for me instead of having to type "system....println"
        System.out.println(word);
    }
    
    public static void puts(int word){ // created a method called puts to print integers for me instead of having to type "syst....intln"
        System.out.println(word);
    }
    

}
