public class Main {

    private static final short len = 200;
    private static double[] arr = new double[len];
    private static double[] arrResults = new double[3];

    public static void main(String[] args) {
        setArr();
        arrResults = getValues(arr);
        printResults(arrResults);
    }

    private static void setArr() {
        for (int i = 0; i < len; i++) {
            arr[i] = Math.random();
        }
    }

    private static double[] getValues(double[] arr) {
        double[] arrResults = new double[3];

        arrResults[0] = arr[0]; // min value
        arrResults[1] = arr[0]; // max value
        arrResults[2] = 0;      // average value

        for (int i = 0; i < len; i++) {
            if (arrResults[0] > arr[i]) {
                arrResults[0] = arr[i];
            }

            if (arrResults[1] < arr[i]) {
                arrResults[1] = arr[i];
            }
            arrResults[2] += arr[i];
        }

        arrResults[2] /= len;

        return arrResults;
    }

    private static void printResults(double[] arrResults) {
        System.out.println("Min value = " + arrResults[0]);
        System.out.println("Max value = " + arrResults[1]);
        System.out.println("Average value = " + arrResults[2]);
    }

}
