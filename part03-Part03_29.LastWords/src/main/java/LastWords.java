
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }   else{
                String[] parts = word.split(" ");
                System.out.println(parts[parts.length-1]);
            }
        }


    }
}
