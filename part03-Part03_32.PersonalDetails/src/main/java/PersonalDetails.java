
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumNum = 0;
        int num = 0;
        int avgNum = 0;
        String name = "";
        String n =" ";
        while(true){
            String word = scanner.nextLine();
            
            if(word.equals("")){
                break;
            }
            
            String[] pieces = word.split(",");
            name = pieces[0];
            int length = name.length();
            int l = n.length();
            num = Integer.valueOf(pieces[1]);
            avgNum++;
            
            if(length > l){
                n = name;
            }
            
            sumNum = sumNum + num;
            
            
            
            
        }
            System.out.println("Longest name: " + n);
            System.out.println("Average of the birth years: "+ (double)sumNum / avgNum);

    }
}
