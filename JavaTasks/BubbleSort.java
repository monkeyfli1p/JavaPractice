import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int len = 10;
    private static int[] arr = new int[len];

    public static void main(String[] args) throws IOException {
        setArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }

    // Filling the array by the user
    private static void setArr(int[] arr) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
    }

    /*
    At each step, we find the largest element from the two adjacent elements
    and put that element at the end of the pair.
     */
    private static void bubbleSort(int[] arr) {

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int val = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = val;
                }
            }
        }
    }

    private static void printArr(int[] arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

}
