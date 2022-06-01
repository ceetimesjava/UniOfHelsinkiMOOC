
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        // for loop that goes through the array
        for (int i = 0; i < array.length; i++) {
            // if-else statement that checks if the current index is less than (array.length -1), if it is print the vale with a comma

            if (i < array.length - 1) { // if i is 
                System.out.print(array[i] + ", ");
            }// if its not, print the value without a comma
            else {
                System.out.println(array[i]);
            }
        }
    }
}
