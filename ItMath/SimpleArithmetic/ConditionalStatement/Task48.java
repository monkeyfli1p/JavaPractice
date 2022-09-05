import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        if (x1 + x2 > x1 + x3 && x1 + x2 > x2 + x3) {
            System.out.println(x1 + " " + x2);
        } else if (x1 + x3 > x1 + x2 && x1 + x3 > x2 + x3) {
            System.out.println(x1 + " " + x3);
        } else {
            System.out.println(x2 + " " + x3);
        }
    }
}
