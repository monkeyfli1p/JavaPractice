import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int nA = a + b;
        int nB = c - nA;
        int nC = a + b + c;

        System.out.println("a = " + nA + ", b = " + nB + ", c = " + nC);
    }
}
