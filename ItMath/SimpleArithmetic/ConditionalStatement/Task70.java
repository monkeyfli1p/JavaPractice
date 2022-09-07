import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task70 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double x1, x2, x3, x4, y1, y2, y3, y4;

        System.out.println("Enter x1 and y1: ");
        x1 = Double.parseDouble(reader.readLine());
        y1 = Double.parseDouble(reader.readLine());

        System.out.println("Enter x2 and y2");
        x2 = Double.parseDouble(reader.readLine());
        y2 = Double.parseDouble(reader.readLine());

        System.out.println("Enter x3 and y3");
        x3 = Double.parseDouble(reader.readLine());
        y3 = Double.parseDouble(reader.readLine());

        if (x1 == x2) {
            x4 = x3;
        } else if (x1 == x3) {
            x4 = x2;
        } else {
            x4 = x1;
        }

        if (y1 == y2) {
            y4 = y3;
        } else if (y1 == y3) {
            y4 = y2;
        } else {
            y4 = y1;
        }

        System.out.println("X4 = " + x4 + " and Y4 = " + y4);

        reader.close();
    }
}
