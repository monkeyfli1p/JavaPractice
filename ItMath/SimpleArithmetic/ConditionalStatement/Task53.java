import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        if (x1 > 30 || x2 > 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
