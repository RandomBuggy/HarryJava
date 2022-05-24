import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;
import java.util.Calendar;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class practice_set_15 {
    public static void main(String[] args) {
        // problem 1
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Student-1");
        ar.add("Student-2");
        ar.add("Student-3");
        ar.add("Student-4");
        ar.add("Student-5");
        ar.add("Student-6");
        ar.add("Student-7");
        ar.add("Student-8");
        ar.add("Student-9");
        ar.add("Student-10");
        System.out.println(ar);
        for (Object obj : ar) {
            System.out.println(obj);
        }
        // problem 2
        Date date = new Date();
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
        // problem 3
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
        // problem 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String CustomDate = dt.format(df);
        System.out.println(CustomDate);
        // problem 5
        HashSet<Integer> hs = new HashSet<>();
        hs.add(6);
        hs.add(7);
        hs.add(66);
        hs.add(46);
        hs.add(9);
        hs.add(6);
        System.out.println(hs);
    }
}

