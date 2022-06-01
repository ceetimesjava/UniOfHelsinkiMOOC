
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumNum = 0;
        double numNum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {

                break;
            } else if (num > 0) {
                sumNum += num;
                numNum++;
            }
        } // end of the while loop
        if (numNum == 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(sumNum / numNum);
        }
    }// end of main method
}
