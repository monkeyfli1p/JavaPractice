import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b = a * a;
        b *= a;

        int c = a * a;
        int d = c * a;
        d *= d;

        int a1 = a * a;
        int a2 = a1 * a;
        int a3 = a1 * a2;
        int a4 = a3 * a3;
        a4 *=a3;

        System.out.println(b);
        System.out.println(d);
        System.out.println(a4);
    }
}
