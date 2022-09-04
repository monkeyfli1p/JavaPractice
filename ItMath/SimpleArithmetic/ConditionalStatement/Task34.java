import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        if (i > 3) {
            i += 10;
        } else {
            i-= 10;
        }

        System.out.println(i);
    }
}
