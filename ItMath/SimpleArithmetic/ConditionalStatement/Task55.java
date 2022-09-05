import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        int count = 0;

        if (x1 > 0) {
            count++;
        }

        if (x2 > 0) {
            count++;
        }

        if (x3 > 0) {
            count++;
        }

        System.out.println(count);
    }
}
