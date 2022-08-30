public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double candyPrice = scanner.nextDouble() / 1000;
        double bizkitPrice = scanner.nextDouble() / 1000;


        System.out.println(300 * candyPrice + 400 * bizkitPrice);
        System.out.println(3 * (2000 * bizkitPrice + 1800 * candyPrice));
    }
}
