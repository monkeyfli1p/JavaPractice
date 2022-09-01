import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(convert(scanner.nextDouble()));
    }

    public static double convert(double c) {
        return c * 9 / 5 + 32;
    }
}
