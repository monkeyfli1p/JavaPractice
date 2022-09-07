import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task71 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int h = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        int offset = 360 / 12;

        double angle = Math.abs(h - m / 5) * offset;

        System.out.println(angle);
    }
}
