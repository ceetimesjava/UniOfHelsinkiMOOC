
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

    }
    public static void divisibleByThreeInRange(int beginning, int end){ // a new method takes in two integers
        for(int i = beginning; i>= beginning && i <= end; i++){ // int i starts from the value of beginning, while i <= beginning 
            if(i%3==0){
                System.out.println(i);
            }   else{
                continue;
            }
        }
    }

}
