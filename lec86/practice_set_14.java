import java.util.Scanner;

public class practice_set_14 {
    public static void main(String[] args) {
        System.out.println("");
        // problem 1
        // syntax error : int a = 7

        try {
            int age = 78;
            int age_born = 100 - 78; // logical error
            System.out.println(5 / 0);
        }
        catch (Exception e){
            System.out.println("Exception : run-time error");
        }

        // problem 2
        try {
            int a = 777 / 8;
        }
        catch (IllegalArgumentException e) {
            System.out.println("HeHe");
        }
        catch (ArithmeticException e) {
            System.out.println("HaHa");
        }


        // problem 3
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int index, i = 0;
        int[] array = new int[3];
        array[0] = 56;
        array[1] = 78;
        array[2] = 89;
        while(flag && i < 5) {
            try {
                System.out.print("Enter Index : ");
                index = sc.nextInt();
                System.out.println("array[index] = " + array[index]);
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error");
        }
    }
}

