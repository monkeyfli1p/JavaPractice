import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x >= 2 && x <= 5) {
            x += 10;
        } else if (x > 7 && x < 40) {
            x -= 100;
        } else if (x < 0 || x > 3000) {
            x *= 3;
        } else {
            x = 0;
        }

        System.out.println(x);
    }
}
