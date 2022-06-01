
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double result = Math.sqrt(num1 + num2);
        System.out.println(result);
    }
}
// Write a program that reads two integers from the user and prints the square root of the sum of these integers. 
//The program does not need to work with negative values.