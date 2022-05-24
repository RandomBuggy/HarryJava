import java.util.Random;
import java.util.Scanner;

class Game {
    private int number;
    private int inputNumber;
    private int numOfGuess = 0;

    public Game() {
        Random random = new Random();
        this.number = random.nextInt(100);
    }

    // getter
    public int getNumOfGuess() {
        return this.numOfGuess;
    }
    // setter
    public void setNumOfGuess(int numOfGuess) {
        this.numOfGuess += numOfGuess;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice: ");
        inputNumber = sc.nextInt();
    }

    public boolean isCorrect() {
        if (this.inputNumber == this.number) {
            System.out.println("Yes. You are right!! The Number is " + this.number);
            return true;
        }
        else if (this.inputNumber > this.number) {
            System.out.println("Too high...");
        }

        else if (this.inputNumber < this.number) {
            System.out.println("Too low...");
        }

        return false;

    }
}

public class exer_3_sol {
    public static void main(String[] args) {
        Game guess = new Game();
        boolean b = false;
        while (!b) {
            guess.takeUserInput();
            guess.setNumOfGuess(1);
            b = guess.isCorrect();
        }
        System.out.println("You Guessed The Number in " + guess.getNumOfGuess() + " Turns");
    }
}

