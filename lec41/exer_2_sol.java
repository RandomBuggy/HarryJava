import java.util.Scanner;
import java.util.Random;

public class exer_2_sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("\\*****Rock Paper Scissors*****/\n\\\t0 - Rock\n\t1 - Paper\n\t2 - Scissor\t/\nEnter your choice: ");
        int userInput = sc.nextInt();
        int computerInput = r.nextInt(3);

        if (userInput == computerInput) {
            System.out.println("Draw");
        }
        
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You WON!!!");
        }
        else {
            System.out.println("computer WON!!!");
        }
    }
}

