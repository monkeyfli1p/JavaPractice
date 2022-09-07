import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task86 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int count = 0;

        for (int i = 1; i <= n ; i++) {
            count += i;
        }

        System.out.println("Count = " + count);
        reader.close(); 
    }
}
