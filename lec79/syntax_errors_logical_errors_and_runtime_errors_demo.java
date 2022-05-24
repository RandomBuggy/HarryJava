import java.util.Scanner;

public class syntax_errors_logical_errors_and_runtime_errors_demo {
    public static void main(String[] args) {
        // syntax error
        // a = 0; --> throws syntax error


        // logical error
        // print prime numbers
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // runtime error
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(1000 / a);
    }
}

