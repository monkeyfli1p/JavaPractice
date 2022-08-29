public class Task8 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println((a + 4 * b) * (a - 3 * b) + degrees(a, 2));
    }

    // Function for degree expansion
    private static int degrees(int num, int degree) {
        int res = num;
        for (int i = 1; i < degree; i++) {
            res *= num;
        }
        return res;
    }
}
