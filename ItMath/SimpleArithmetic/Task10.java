public class Task10 {
    public static void main(String[] args) {
        double x1 = 1.7;
        int x2 = 3;

        System.out.println(degrees(x1 + 1, 2) + 3 * (x1 + 1));
        System.out.println(degrees(x2 + 1, 2) + 3 * (x2 + 1));
    }

    // Function for degree expansion
    private static int degrees(int num, int degree) {
        int res = num;
        for (int i = 1; i < degree; i++) {
            res *= num;
        }
        return res;
    }

    private static double degrees(double num, int degree) {
        double res = num;

        for (int i = 1; i < degree; i++) {
            res *= num;
        }
        return res;
    }
}
