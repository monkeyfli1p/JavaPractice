import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task76 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Silence is golden");
        }
        
        reader.close();
    }
}
