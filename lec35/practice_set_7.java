public class practice_set_7 {
    // practice problem 1
    static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
        }
    }
    // practice problem 2
    static void createPattern1(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    //practice problem 3
    static int recusiveSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number + recusiveSum(number - 1);
    }
    //practice problem 4
    static int fubonacci(int item) {
        /* if (item == 1) {
            return 0;
        }
        else if (item == 2) {
            return 1;
        } */
        if (item == 1 || item == 2) {
            return item - 1;
        }
        else {
            return fubonacci(item - 2) + fubonacci(item - 1);
        }
    }
    // practice problem 5
    static int average(int ...vector) {
        int sum = 0;
        for (int element : vector) {
            sum += element;
        }
        return sum / vector.length;
    }
    // practice problem 6
    static void createPattern1Recursive(int number) {
        if (number > 0) {
            createPattern1Recursive(number - 1);
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // practice problem 7
    static float celciusToFarenheight(float celcius) {
        float faren = (celcius * 1.8f) + 32.0f;
        return faren;
    }
    public static void main(String[] args) {
        multiplicationTable(7);
        createPattern1(5);
        System.out.println(recusiveSum(5));
        System.out.println(fubonacci(8));
        System.out.println(average(1, 2, 3, 4, 5));
        createPattern1Recursive(5);
        System.out.println(celciusToFarenheight(8));
    }
}

