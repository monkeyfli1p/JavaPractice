import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();

        int a1 = x1 + x2;
        int a2 = x2 + x3;
        int a3 = x1 + x3;
        
        if (a1 == x3 || a2 == x1 || a3 == x2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
