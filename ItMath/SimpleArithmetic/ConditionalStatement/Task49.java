import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();

        if (x1 % 2 == 0 && x1 > x2 && x1 > x3 && x1 > x4) {
            System.out.println(x1);
        } else if (x2 % 2 == 0 && x2 > x1 && x2 > x3 && x2 > x4) {
            System.out.println(x2);
        } else if (x3 % 2 == 0 && x3 > x1 && x3 > x2 && x3 > x4) {
            System.out.println(x3);
        } else if (x4 % 2 == 0 && x4 > x1 && x4 > x2 && x4 > x3) {
            System.out.println(x4);
        } else {
            System.out.println("not found");
        }
        
        scanner.close();
    }
}
