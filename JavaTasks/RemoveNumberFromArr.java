import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] arr;
    private static int[] arrResults;
    private static int numForRemove;

    public static void main(String[] args) throws IOException {
        arr = createArr();
        countNumForRemove(numForRemove);
        printArrays();
    }

    private static int[] createArr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the array size: ");
        int[] arr = new int[Integer.parseInt(reader.readLine())];

        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        System.out.println("Value for remove from array: ");
        numForRemove = Integer.parseInt(reader.readLine());

        return arr;
    }

    private static void countNumForRemove(int numForRemove) {
        int offset = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numForRemove != arr[i]) {
                offset++;
            }
        }
        createArrResults(offset);
        offset = 0;

        for (int i = 0; i < arr.length; i++) {
            if (numForRemove != arr[i]) {
                arrResults[offset] = arr[i];
                offset++;
            }
        }
    }

    private static void createArrResults(int offset) {
        arrResults = new int[offset];
    }

    private static void printArrays() {
        System.out.println("Start array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nResults array: ");
        for (int i = 0; i < arrResults.length; i++) {
            System.out.print(arrResults[i] + " ");
        }
    }
}
