
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int n =0;
                
        
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String[] parts = word.split(",");
            age = Integer.valueOf(parts[1]);
            if(age>n){
                n=age;
            }
            
        }
        System.out.println("Age of the oldest: "+ n);
        
        


    }
}
