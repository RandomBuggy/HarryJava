import java.util.Date;

public class the_date_class {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getYear());
        System.out.println(1900 + date.getYear());
        System.out.println(date.getSeconds());
    }
}

