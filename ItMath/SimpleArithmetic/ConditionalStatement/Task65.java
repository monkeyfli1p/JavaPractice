import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task65 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numStr = reader.readLine();
        ArrayList<Integer> num = new ArrayList<>();

        for (char ch : numStr.toCharArray()) {
            int n = Character.getNumericValue(ch);
            if (n < 5) {
                num.add(0, n);
            } else {
                num.add(n);
            }
        }

        for (int x : num) {
            System.out.print(x + "");
        }

        reader.close();

    }
}
