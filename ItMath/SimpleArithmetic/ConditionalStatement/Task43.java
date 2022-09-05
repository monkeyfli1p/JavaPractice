import java.util.Scanner;

public class Task43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        
        if (x == 1 || x == 2 || x == 12) {
            System.out.println("WINTER");
        } else if (x >= 3 && x <= 5) {
            System.out.println("SPRING");
        } else if (x >= 6 && x <= 8) {
            System.out.println("SUMMER");
        } else if (x >= 9 && x <= 11) {
            System.out.println("FALL");
        }
    }
}
