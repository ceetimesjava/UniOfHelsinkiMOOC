
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in your number");
        int num = scan.nextInt();
        if(num <= 0){
            System.out.println("Invalid number");
        }   else if(num%2 == 0){
            System.out.println("Yor number is an even number");
        }   else{
            System.out.println("Your number is odd");
        }
    }
}
