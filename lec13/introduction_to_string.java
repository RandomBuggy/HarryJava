import java.util.Scanner;
public class introduction_to_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
        String St = "Harry";
        System.out.print(St);

        int a = 5;
        float b = 4.567f;

        System.out.printf("a : %d and b : %f", a, b);
        System.out.printf("a : %d and b : %0.2f", a, b);
        System.out.printf("a : %d and b : %8.2f", a, b);

        System.out.format("a : %d and b : %8.2f", a, b);
    }
}
