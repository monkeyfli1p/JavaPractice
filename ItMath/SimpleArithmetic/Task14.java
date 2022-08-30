public class Task13 {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double x = 1;

        System.out.println(Math.pow(Math.pow(x, 2) + b, 1.0 / 5.0) - (Math.pow(b, 2) * Math.pow(Math.sin(x + a), 3)) / x);
    }
}
