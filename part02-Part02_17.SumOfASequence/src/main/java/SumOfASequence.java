
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        int sum = 0;
        int num = scanner.nextInt();
        for(int i = 0; i<= num; i++ ){
            sum += i;
        }
        System.out.println("The sum is " + sum);
        
    }
}
