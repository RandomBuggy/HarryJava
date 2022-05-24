import java.util.*;

public class the_calender_class {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        // System.out.println(calender.getCalenderType());
        System.out.println(calender.getTimeZone());
        System.out.println(calender.getTimeZone().getID());
    }
}

