import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task60 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int number = Integer.parseInt(reader.readLine());
        String number = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (char ch : number.toCharArray()) {
            arrayList.add(Character.getNumericValue(ch));
        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + "");
        }

        reader.close();
    }
}
