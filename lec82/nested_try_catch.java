import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 786;
        array[1] = 544;
        array[2] = 743;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index : ");
        int index = sc.nextInt();
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        try {
            System.out.println("try block level 1");
            try {
                System.out.println("try block level 2");
                System.out.println(array[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception block level 2");
                System.out.println(e);
            }
        }
        catch (Exception e) {
            System.out.println("Exception block level 1");
            System.out.println(e);
        }
        System.out.println("Programme Finished!!!");
    }
}

