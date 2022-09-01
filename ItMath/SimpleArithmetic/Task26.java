import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("x = " + x);
        System.out.println("y = " + y + "\n");

        double a = y;
        y = x;
        x = a;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
