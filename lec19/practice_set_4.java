import java.util.Scanner;

public class practice_set_4 {
    public static void main(String[] args) {
        // problem 1;
        int a = 10;

        // throw an error because assign operation is not possible inside if condition
        // if (a = 11) {
        if (a == 11) {
            System.out.println("I am at age 11");
        }

        else {
            System.out.println("I am not at 11");
        }

        // problem 2;
        byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks of Physics: ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks of Chemistry: ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks of Mathematics: ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3) / 3.0f;
        System.out.println("Total average is " + avg);

        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Congratulations!, You have been promoted");
        }

        else {
            System.out.println("Sorry!!, You have not been promoted.Please, try again");
        }

        // problem 3
        float tax = 0;
        System.out.print("Enter your income in laks: ");
        float income = sc.nextFloat();

        if (income < 2.5) {
            tax += 0;
        }

        else if (income >= 2.5f && income <= 5.0f) {
            tax += 0.05f * (income - 2.5f);
        }

        else if (income > 5.0f && income <= 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.20f * (income - 5.0f);
        }

        else if (income > 10.0f) {
            tax += 0.05f * (5.0f - 2.5f);
            tax += 0.20f * (10.0f - 5.0f);
            tax += 0.30f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee: " + tax);

        // problem 4
        System.out.print("Enter a number to display a day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // problem 5
        // problem 6

        System.out.print("Enter a website URL: ");
        String website = sc.next();

        if (website.endsWith(".org")) {
            System.out.println("This is a organisational website.");
        }

        else if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        }

        else if (website.endsWith(".in")) {
            System.out.println("This is a indian website.");
        }
    }
}

