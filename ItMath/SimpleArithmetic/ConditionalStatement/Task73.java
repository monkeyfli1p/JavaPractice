import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task73 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double xl1 = Double.parseDouble(reader.readLine());
        double yb1 = Double.parseDouble(reader.readLine());
        double xr1 = Double.parseDouble(reader.readLine());
        double yt1 = Double.parseDouble(reader.readLine());
        double xl2 = Double.parseDouble(reader.readLine());
        double yb2 = Double.parseDouble(reader.readLine());
        double xr2 = Double.parseDouble(reader.readLine());
        double yt2 = Double.parseDouble(reader.readLine());

        if (xl1 >= xl2 && xr1 <= xr2 && yb1 >= yb2 && yt1 <= yt2) {
            System.out.println("A) - Yes");
        } else {
            System.out.println("A) - No");
        }

        if (xl1 >= xl2 && xr1 <= xr2 && yb1 >= yb2 && yt1 <= yt2 || xl2 >= xl1 && xr2 <= xr1 && yb2 >= yb1 && yt2 <= yt1) {
            System.out.println("B) - Yes");
        } else {
            System.out.println("B) - No");
        }

        if (Math.max(xl1, xl2) <= Math.min(xr1, xr2) && Math.max(yb1, yb2) <= Math.min(yt1, yt2)) {
            System.out.println("C) - Yes");
        } else {
            System.out.println("C) - No");
        }
        
        reader.close();
    }
}
