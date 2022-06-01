
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        System.out.println("Search for? ");
        int num = scanner.nextInt();
        int count = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if (num == list.get(i)){
                count = i;
                System.out.println(num + " is at index "+ count);
            }
            
        }
         
        // implement here finding the indices of a number
    }
}
