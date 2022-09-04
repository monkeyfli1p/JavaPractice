import java.time.Month;
import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Month month = Month.of(scanner.nextInt());
        System.out.println(month);
    }
}
