import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        double y = scanner.nextDouble();
        double k = scanner.nextDouble();

        double price = a / x;
        System.out.println(price * y);
        System.out.println(k / price);
    }
}
