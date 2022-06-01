
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("")) {
                break;
            } else {
                String[] parts = word.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    if(parts[i].contains("av"))
                    System.out.println(parts[i]);
                }
            }
        }
    }
}
