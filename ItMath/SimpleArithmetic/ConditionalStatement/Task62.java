import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task62 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder number = new StringBuilder(reader.readLine());

        for (int i = 0; i < number.length(); i++) {
            if (Character.getNumericValue(number.charAt(i)) % 2 == 0)  {
                number.setCharAt(i, '0');
            }
        }

        System.out.println(number);

        reader.close();
    }
}
