public class methods {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }
    int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        // static method to static method direct call
        int a = logic(7, 8);
        int b = logic(8, 8);
        System.out.println(a);
        System.out.println(b);
        // with object
        methods obj = new methods();
        int c = obj.sum(1, 1);
        System.out.println(c);
    }
}

