import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x < 7) {
            System.out.println("Yes");
        } else if (x > 10) {
            System.out.println("No");
        } else if (x == 9) {
            System.out.println("Error");
        }
    }
}
