import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task63 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder num1 = new StringBuilder(reader.readLine());
        StringBuilder num2 = new StringBuilder(reader.readLine());

        StringBuilder result = new StringBuilder(num1);
        result.append(num2);

        System.out.println(Integer.parseInt(String.valueOf(result)));

        reader.close();
    }
}
