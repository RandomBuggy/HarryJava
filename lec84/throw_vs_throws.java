class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius can not be negative!";
    }
    @Override
    public String getMessage() {
        return "Radius can not be negative!";
    }
}
public class throw_vs_throws {
    /* throws keyword pre-warned about exception */
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }
    public static int divide(int a, int b) throws ArithmeticException {
        // made by harry
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("");
        // shivam
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(area(-6));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

