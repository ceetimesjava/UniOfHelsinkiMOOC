
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String secName = "";
        int age = 0;
        int n = 0;
        
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String [] parts = word.split(",");
            age = Integer.valueOf(parts[1]);
            name = parts[0];
            
            if(age > n){
                n = age;
                secName = name;
            }
            
            
           
        }
        System.out.println("Name of the oldest: " + secName);
        


    }
}
