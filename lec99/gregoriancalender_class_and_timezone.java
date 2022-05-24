import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregoriancalender_class_and_timezone {
    public static void main(String[] args) {
        System.out.println("");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY) +":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2022));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
        System.out.println(TimeZone.getAvailableIDs()[4]);
        System.out.println(TimeZone.getDefault());
    }
}

