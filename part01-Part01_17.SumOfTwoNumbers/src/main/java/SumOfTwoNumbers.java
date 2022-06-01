
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int nu = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + num1 + nu);
    }
}
