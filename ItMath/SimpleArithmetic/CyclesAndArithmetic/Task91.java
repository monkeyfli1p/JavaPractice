public class Task91 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 2; i <= 9 ; i++) {
            sum += ((double) i / ((double) i + 1));
        }

        System.out.println(sum);
    }
}
