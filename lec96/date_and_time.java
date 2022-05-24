public class date_and_time {
    public static void main(String[] args) {
        System.out.println("");
        // for java-8 and java-8+ package - java.time - is present
        // before java-8 and java.util package
        // 
        // date stored - as a long number - milliseconds from Jan-1-1970 till now
        // start year as - 1900
        // use System.currentTimeMillies() to get time in milliseconds
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
    }
}

