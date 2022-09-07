import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task67 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (char ch : number.toCharArray()) {
            arrayList.add(Character.getNumericValue(ch));
        }

        int max = arrayList.get(0);
        int min = arrayList.get(1);
        int indMax = 0;
        int indMin = 1;

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < max) {
                indMax = i;
                max = arrayList.get(i);
            } else if (arrayList.get(i) > min) {
                indMin = i;
                min = arrayList.get(i);
            }
        }

        arrayList.remove(indMax);
        arrayList.add(indMax, min);
        arrayList.remove(indMin);
        arrayList.add(indMin, max);

        StringBuilder res = new StringBuilder();

        for (int x : arrayList) {
            res.append(x);
        }

        System.out.println(res);

        reader.close();

    }
}
