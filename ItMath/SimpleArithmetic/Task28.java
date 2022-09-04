import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double S = scanner.nextDouble();    // amount
        double P = scanner.nextDouble();    // annual rate (in percent)

        double res = (S * P) / 100;

        System.out.println(res * 5);
    }
}
