public class for_each_loop {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(marks.length);
        String[] students = {"Harry", "Rohan", "Shubham", "Lovish"};

        // display array (Naive way)
        System.out.println("Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);
        System.out.println(marks[8]);
        System.out.println("With for loop");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // Quick Quiz - reverse order

        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }

        System.out.println("With for-each loop");

        for (int placeholder : marks) {
            System.out.println(placeholder);
        }
    }
}

