public class practice_set_5 {
    public static void main(String[] args) {
        // problem 1;

        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // problem 2;

        int sum = 0;
        int num = 5;

        for (int i = 0; i < num; i++) {
            sum += (2 * i);
        }
        System.out.println("First " + num + " even numbers sum is " + sum);

        // problem 3;

        int number = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }

        // problem 4;

        number = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }

        // problem 5;

        n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is " + fact);

        // problem 6;

        int i = 1;
        int factorial = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        System.out.println(n + " factorial using while loop " + factorial);

        // problem 9;

        sum = 0;
        num = 8;

        for (i = 1; i <= 10; i++) {
            sum += (num * i);
        }
        System.out.println("The sum of " + num + " multiplication table is " + sum);


    }
}

