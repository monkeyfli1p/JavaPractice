import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        if (x1 > x2) {
            System.out.println("Yes");
        } else {
            x1 = x1 + x2;
            x2 = x1 - x2;
            x1 = x1 - x2;
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        }
    }
}
