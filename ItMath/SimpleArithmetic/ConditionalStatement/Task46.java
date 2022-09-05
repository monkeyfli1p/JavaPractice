import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int count = 0;

        if (x1 % 5 == 0) {
            count += x1;
        }
        if (x2 % 5 == 0) {
            count += x2;
        }
        if (x3 % 5 == 0) {
            count += x3;
        }

        if (count == 0) {
            System.out.println("Error");
        } else {
            System.out.println(count);
        }
    }
}
