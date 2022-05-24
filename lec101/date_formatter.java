import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_formatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy - H:m $ a / \\ E"); /* formatter object */
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String CustomDate = dt.format(df);
        System.out.println(CustomDate);
    }
}

