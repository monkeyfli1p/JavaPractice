import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        if (x1 > 10 && x2 > 10 && x3 > 10 && x1 % 3 == 0 && x2 % 3 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
