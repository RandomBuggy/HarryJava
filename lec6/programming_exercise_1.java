import java.util.Scanner;

public class programming_exercise_1 {
    public static void main(String[] args) {
        float sum = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Subject Mark: ");
        float a = input.nextFloat();
        System.out.print("Enter Second Subject Mark: ");
        float b = input.nextFloat();
        System.out.print("Enter Third Subject Mark: ");
        float c = input.nextFloat();
        System.out.print("Enter Fourth Subject Mark: ");
        float d = input.nextFloat();
        System.out.print("Enter Fifth Subject Mark: ");
        float e = input.nextFloat();
        sum = ((a + b + c + d + e) / 5);

        System.out.print("Your percentage is ");
        System.out.println(sum);
    }
}
