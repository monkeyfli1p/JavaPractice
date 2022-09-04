import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        if (x > 100 || x < -100) {
            x = 0;
            System.out.println("X = " + x);
        } else {
            x += 5;
            System.out.println("X = " + x);
        }
    }
}
