import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task69 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(reader.readLine());
        double b = Double.parseDouble(reader.readLine());
        double c = Double.parseDouble(reader.readLine());

        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            double p = (a + b + c) / 2;
            double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

            System.out.println("p = " + p);
            System.out.println("s = " + s);
        } else {
            System.out.println("NaN");
        }
        
        reader.close();
    }
}
