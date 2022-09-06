import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task66 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder num1 = new StringBuilder(reader.readLine());
        StringBuilder num2 = new StringBuilder(reader.readLine());

        num1.delete(num1.length() - 1, num1.length());
        num2.delete(num2.length() - 1, num2.length());

        StringBuilder result = new StringBuilder(num1);
        result.append(num2);

        System.out.println(Integer.parseInt(String.valueOf(result)));

        reader.close();
    }
}
