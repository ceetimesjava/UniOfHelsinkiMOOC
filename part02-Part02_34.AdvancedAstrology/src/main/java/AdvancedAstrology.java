
public class AdvancedAstrology {

    public static void printStars(int number) {
        int num = 0;
        while (num< number){
            System.out.print("*");
            num++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int num = 0;
        while (num<= number){
            System.out.print(" ");
            num++;
        }
        
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i<=size){
            printSpaces(size-1);
            printStars(i);
            i++;
            
        }
    }

    public static void christmasTree(int height) {
        int i =0;
        while(i<=height){
            printSpaces(height - i);
            printStars(2 * i - 1);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
