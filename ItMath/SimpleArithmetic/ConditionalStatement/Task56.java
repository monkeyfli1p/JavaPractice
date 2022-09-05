import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int n = scanner.nextInt();

        num += n;

        if (num == 11 || num == 15) {
            System.out.println("North");
        } else if (num == 12) {
            System.out.println("West");
        } else if (num == 13) {
            System.out.println("South");
        } else if (num == 14 || num == 10) {
            System.out.println("East");
        }

        scanner.close();
    }
}
