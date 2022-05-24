public class varargs {
    // to avoid extra method overloading use this ...(triple dot) concatenate with parameter's name like ...parameter_name. this ... variable is called varArgs array in java, it is similler to *args and **keargs in python
    static int sum(int ...array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return sum;
    }
    //you can use both normal parameters and varArgs parameters
    //but first n parameter as normal and last th parameter as varargs is recommanded in methods
    public static void main(String[] args) {
        System.out.println("The sum is " + sum(1, 2, 3,  4, 5, 6, 7, 8, 9, 10));
    }
}

