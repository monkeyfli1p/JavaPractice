import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task95 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        int p = 1;

        for (int i = 1; i <= n; i++) {
            p *= Math.pow(a + i, 2);
        }

        System.out.println(p);
    }
}
