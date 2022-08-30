import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double km = scanner.nextDouble();
        double m = scanner.nextDouble();

        double res = (km / m) / 3.6;

        System.out.println("m/s = " + res);
    }
}
