public class finally_block_why_it_is_needed {
    // finally block executes must must wheather a function returns or a loop breaks
    public static int greet() {
        try {
            int a = 5;
            int b = 0;
            return a / b;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning Up Resources...");
        }
        return -1;
    }
    public static void main(String[] args) {
        int p = greet();
        int a = 7;
        int b = 9;
        while(true) {
            try {
                System.out.println(a/b);
            }
            catch (Exception e) {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("finally block and b = " + b);
            }
            b--;
        }
        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println("finally block without catch block");
        }
    }
}

