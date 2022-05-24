public class method_overloading {
    static void tellJoke() {
        System.out.println("I invented a new word\n\"Plagarism\"");
    }

    static void change(int a) {
        a = 56;
    }

    static void change(int[] a) {
        a[0] = 98;
    }
    // method overloading can only be done by increasing or decreasing the number of parameters not by changing return type
    public static void main(String[] args) {
        tellJoke();
        int x = 68;
        System.out.println(x);
        change(x);
        System.out.println(x);
        int[] marks = {45, 67, 89, 74, 93, 66};
        System.out.println(marks[0]);
        change(marks);
        System.out.println(marks[0]);
    }
}

