import java.util.Scanner;

public class recursion {
    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get its factorial: ");
        int number = sc.nextInt();
        int result = factorial(number);
        System.out.println("The factorial is " + result);
    }
}

