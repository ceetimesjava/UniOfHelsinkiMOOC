
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num = scanner.nextInt();
        System.out.println("Give the second number:");
        int num1 = scanner.nextInt();
        System.out.println("Give the third number:");
        int num2 = scanner.nextInt();
        double result = 1.0 * (num + num1 + num2)/ 3;
        System.out.println("The average is " + result);
        
        
        

        // Write your program here

    }
}
