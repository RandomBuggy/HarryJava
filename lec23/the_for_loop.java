import java.util.Scanner;

public class the_for_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // false statement

        for (int j = 1; j <= 0; j--) {
            System.out.println("False Statement!!!");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Odd number: ");
        int n = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            System.out.println(2 * i + 1);
        }

        for (int p = 10; p != 0; p--) {
            System.out.println(p);
        }
    }
}

