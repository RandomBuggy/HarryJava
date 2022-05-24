import java.util.Scanner;

public class switch_case_statements {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Using if-else ladder");
        if (age > 56) {
            System.out.println("You are experienced!");
        }

        else if(age > 46) {
            System.out.println("You are semi-experienced!");
        }

        else if(age > 36) {
            System.out.println("You are semi-semi-experienced!!");
        }

        else {
            System.out.println("You are not experienced");
        }


        System.out.println("Using switch-case statements");
        System.out.println("Enhanced switch-case,no need of break-continue keyword\nVariable's value can be a integer, character or a string");

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("This default case");
        }
    }
}
