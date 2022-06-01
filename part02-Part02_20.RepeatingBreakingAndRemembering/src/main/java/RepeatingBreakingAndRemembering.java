
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int numNum = 0, sum = 0, evenNum = 0, oddNum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            } else if(num % 2 == 0){
                sum += num;
                numNum++;
                evenNum++;
                continue;
            }   else{
                sum += num;
                numNum++;
                oddNum++;
                continue;
            }
        }
        double avgNum = sum / (double)numNum;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numNum);
        System.out.println("Average: " + avgNum);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}
