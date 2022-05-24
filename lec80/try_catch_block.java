public class try_catch_block {
    public static void main(String[] args) {
        //exception example
        // null pointer exception
        // arithmetic exception
        // arrayIndexOutOfBound exception
        // Illegal argument exception
        // numberFormat exception
        //
        // two types of exception
        // 1. checked exception --> auto handled by compiler
        // 2. unchecked exception --> manually handled by programmer

        int a = 1000;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.print("Error occur. error is ");
            System.out.println(e);
        }
        System.out.println("End of the programme");
    }
}

