public class Task9 {
    public static void main(String[] args) {
        int x = -2;
        System.out.println(motn(x) + degrees(x, 5));
    }

    // Function for degree expansion
    private static int degrees(int num, int degree) {
        int res = num;
        for (int i = 1; i < degree; i++) {
            res *= num;
        }
        return res;
    }

    // Module of the number (abs)
    private static int motn(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
