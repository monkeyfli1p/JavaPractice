import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task59 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int[] arr = new int[4];

        arr[0] = number / 1000;
        arr[1] = (number % 1000) / 100;
        arr[2] = (number % 100) / 10;
        arr[3] = number % 10;

        boolean isTrue = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
            } else {
                isTrue = false;
                break;
            }
        }

        System.out.println(isTrue);

    }
}
