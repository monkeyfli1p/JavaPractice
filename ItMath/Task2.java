import java.time.DayOfWeek;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        DayOfWeek day = DayOfWeek.of(calendar.get(Calendar.DAY_OF_WEEK) - 1);   // Day Of week from calendar
        Month month = Month.of(calendar.get(Calendar.MONTH) + 1);
        System.out.println("Day of week - " + day + "\nMonth - " + month + "\nName - Daniel");
    }
}
