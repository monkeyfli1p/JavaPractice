public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double sres = (a + b + c) / 3;
        double res = (a + c) * 2 - (a + c) * 2 - b * 3;

        System.out.println(sres);
        System.out.println(res);
    }
}
