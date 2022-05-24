import java.util.Scanner;

public class getting_user_input {
    public static void main(String[] args) {
        System.out.println("It works!");
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("The sum is ");
        System.out.println(a + b);

        System.out.print("Enter test integer: ");
        boolean bool = sc.hasNextInt();
        System.out.println(bool);

        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println(str);
        System.out.print("Enter a string: ");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
