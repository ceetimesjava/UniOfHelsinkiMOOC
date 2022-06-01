
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumNum = 0;
        double numNum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            } else {
                sumNum = sumNum + num;
                numNum = numNum + 1;
                
            }
        }
        double avgNum = (sumNum/numNum);
        System.out.println("Average of the numbers: " + avgNum );
    }
}
