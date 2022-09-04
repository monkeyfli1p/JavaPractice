import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x > -10 && x < 10) {
            System.out.println(x + 5);
        } else {
            System.out.println(x - 10);
        }
    }
}
