public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x >= 0 && y >= 0) {
            System.out.println(Math.sqrt(x - Math.sqrt(y)));
        } else {
            System.out.println("Error value");
        }

    }
}
