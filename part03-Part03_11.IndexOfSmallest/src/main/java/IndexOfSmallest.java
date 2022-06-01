
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = num.nextInt();
            if (input == 9999) {
                break;
            } // end of if statememt
            numbers.add(input);
        }// end of while loop
        int smallest = numbers.get(0);
        int count = 0;
        for (int i = 0; smallest >= numbers.get(i); i++) {
            smallest = numbers.get(i);
        }

        System.out.println("Smallest number: " + smallest);

        for (int j = 0; j < numbers.size(); j++) {
            if (smallest == numbers.get(j)) {
                count = j;
                System.out.println("Found at index: " + count);
            }
        }
        //System.out.println("Found at index: "+ count);
    }
}
// after that, the program prints the smallest number
// and its index -- the smallest number
        // might appear multiple times
