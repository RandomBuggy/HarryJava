import java.util.Scanner;

public class handling_specific_exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array index: ");
        int index = sc.nextInt();
        System.out.println("Enter the number (division)");
        int number = sc.nextInt();
        int[] array = new int[3];
        array[0] = 577;
        array[1] = 342;
        array[2] = 862;

        try {
            System.out.println("Value : " + array[index]);
            System.out.println("Result : " + array[index] / number);
        }

        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!!!");
            System.out.println(e);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Some other exception occured!!!");
            System.out.println(e);
        }
        System.out.println("Programme Finished");
    }
}

