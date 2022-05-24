import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return super.toString() + "I am toString()";
    }
    @Override
    public String getMessage() {
        return super.getMessage() + "I am getMessage()";
    }
}

public class the_exception_class {
    public static void main(String[] args) {
        // built-in class in java
        // to imolement custom exception and we can override its many methods
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        if (a < 99) {
            try {
                throw new MyException();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
        }
    }
}
}

