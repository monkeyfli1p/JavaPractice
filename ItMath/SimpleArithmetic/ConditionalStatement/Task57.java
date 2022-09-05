import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (month != 2 && month > 0 && month < 13) {
            if (day > 0 && day < 32) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if (month == 2) {
            if (day > 0 && day < 29) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
