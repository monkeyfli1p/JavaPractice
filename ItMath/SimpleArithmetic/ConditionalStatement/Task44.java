import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        if (x1 != 10 && x2 != 10 && x1 % 2 == 0) {
            System.out.println("X1 + X2 = " + (x1 + x2));
        } else {
            System.out.println("X1 * X2 = " + (x1 * x2));
        }
    }
}
