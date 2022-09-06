import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task61 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        List<Integer> list = new ArrayList<>();

        for(char ch: number.toCharArray()) {
            list.add(Character.getNumericValue(ch));
        }

        boolean isTrue = false;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    isTrue = true;
                    break;
                }
            }
        }

        System.out.println(isTrue);

    }
}
