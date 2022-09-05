import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        if ((x1 < 5 && x2 < 5 && x3 >= 5) || (x1 < 5 && x3 < 5 && x2 >= 5) || (x2 < 5 && x3 < 5 && x1 >= 5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
