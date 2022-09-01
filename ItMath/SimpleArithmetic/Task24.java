public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int sale = scanner.nextInt();
        double sum = scanner.nextDouble();

        sale /= 100;

        for (int i = 0; i < days; i++) {
            sum+= 3;
            sum += sum * sale;
        }

        System.out.println(sum);
    }
}
