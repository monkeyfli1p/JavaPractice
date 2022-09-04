import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        if (x1 - 100 == x2 || x1 + 100 == x2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
