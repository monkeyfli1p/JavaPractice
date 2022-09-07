import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task94 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double sum = 1.0;

        for (int i = 2; i <= n; i++) {
            sum += 1.0 / (double) i;
        }

        System.out.println(sum);
        reader.close();
    }
}
