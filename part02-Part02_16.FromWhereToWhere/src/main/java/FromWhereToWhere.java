
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int num = scanner.nextInt();
        System.out.println("Where from?");
        int num2 = scanner.nextInt();
        for(int i = num2; num2<= num; num2++){
            System.out.println(num2);
        }

        // Write your program here
    }
}
