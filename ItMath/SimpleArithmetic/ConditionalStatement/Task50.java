import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        if (x1 == x2 || x1 == x3 || x3 == x2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
