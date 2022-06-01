
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numToHundred = scanner.nextInt();
        for(int counter = numToHundred; counter<=1000; counter++){
            System.out.println(counter);
            
        }

    }
}
