import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task58 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int day1 = Integer.parseInt(reader.readLine());
        int month1 = Integer.parseInt(reader.readLine());
        int year1 = Integer.parseInt(reader.readLine());

        int day2 = Integer.parseInt(reader.readLine());
        int month2 = Integer.parseInt(reader.readLine());
        int year2 = Integer.parseInt(reader.readLine());

        if (year1 < year2) {
            System.out.println("Yes");
        } else {
            if ((month1 > 0 && month1 < 13 && month2 > 0 && month2 < 13) && (day1 > 0 && day1 < 32 && day2 > 0 && day2 < 32)) {
                if (month1 < month2) {
                    System.out.println("Yes");
                } else if (month1 == month2) {
                    if (day1 < day2) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Error");
            }
        }
        
        reader.close();

    }
}
