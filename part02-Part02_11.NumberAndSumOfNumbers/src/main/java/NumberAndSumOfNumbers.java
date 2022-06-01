
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNum = 0;
        int numOfNum = 0;
        while(true){
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if(num == 0){
                break;
            }   else{
                sumOfNum = sumOfNum + num;
                numOfNum = numOfNum + 1;
            }
        }
        System.out.println("Number of numbers: " + numOfNum);
        System.out.println("Sum of the numbers: " + sumOfNum);

    }
}
