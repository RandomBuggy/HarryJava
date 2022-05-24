public class relational_and_logical_operators {
    public static void main(String args[]) {
        boolean a = true;
        boolean b = false;


        boolean result = a && b;
        result = a || b;

        boolean c = true;
        result = a || b || c;

        System.out.println(result);

        if (!result) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }
    }
}
