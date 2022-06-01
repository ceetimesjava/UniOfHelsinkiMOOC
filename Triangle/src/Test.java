import java.util.Scanner;

class Test {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setBase(7.2);
        t1.setHeight(12.3);
        System.out.println(t1.area());
        System.out.println(t1.toString());
    }
}
