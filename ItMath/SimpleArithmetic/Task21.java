import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double cathetus1 = scanner.nextDouble();
        double cathetus2 = scanner.nextDouble();

        double area = 1f / 2f * cathetus1 * cathetus2;
        double hypotenuse = Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
        double perimeter = cathetus1 + cathetus2 + hypotenuse;

        System.out.println("Area = " + area);
        System.out.println("Hypotenuse = " + hypotenuse);
        System.out.println("Perimeter = " + perimeter);
    }
}
