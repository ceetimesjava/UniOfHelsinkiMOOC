
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String st = scan.nextLine();
        System.out.println("Give an integer:");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.nextLine());        
        System.out.println("Give a boolean:");
        boolean sumin = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + st);
        System.out.println("You gave the integer " + num);
        System.out.println("You gave the double " + num2);
        System.out.println("You gave the boolean " + sumin);
    }
}
