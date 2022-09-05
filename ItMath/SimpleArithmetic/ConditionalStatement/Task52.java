import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();

        if (x1 > 5 && x2 > 5 && x3 % 6 == 0 && x4 % 3 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
