import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weeks = scanner.nextInt();
        int months = scanner.nextInt();
        int year = scanner.nextInt();

        int days = 0;

        days += (weeks * 7);
        days += (months * 30);
        days += (year * 12 * 30);

        System.out.println(days);
    }
}
