import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        String str;
        FileReader fin = new FileReader("input.txt");
        Scanner sc = new Scanner(fin);
        str = sc.nextLine();
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(str);
        fileWriter.close();
        sc.close();
        fin.close();
    }
}
