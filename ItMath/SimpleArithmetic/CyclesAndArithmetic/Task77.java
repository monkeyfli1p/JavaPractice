import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task77 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("0");
            }
            System.out.println();
        }

        reader.close();
    }
}
