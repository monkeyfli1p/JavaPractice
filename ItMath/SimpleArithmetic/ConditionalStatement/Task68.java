import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task68 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

        if (a > 0) {
            double d = (b * b) - 4 * a * c;
            if (d == 0) {
                double res = (-b) / 2 * a;
                System.out.println("D = " + d);
                System.out.println(res);
            } else if (d > 0) {
                double res1 = (-b + Math.sqrt(d)) / (2 * a);
                double res2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("D = " + d);
                System.out.println(res1);
                System.out.println(res2);
            } else {
                System.out.println("NaN");
            }
        } else {
            System.out.println("a = 0, end program");
        }

        reader.close();
    }
}
