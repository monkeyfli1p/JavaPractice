public class Task90 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 3; i <= 111 ; i += 2) {
            sum += Math.cos((double) i / (i + 2));
        }

        System.out.println(sum);
    }
}
