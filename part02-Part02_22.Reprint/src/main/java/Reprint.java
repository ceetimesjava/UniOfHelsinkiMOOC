
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times?");
        int num = scan.nextInt();
        int num1 = 0;
        while(num1< num){
            printText();
            num1++;   
        } 
// then call the printText-method multiple times with a while-loop
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
