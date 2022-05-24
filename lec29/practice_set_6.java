import java.util.Scanner;

public class practice_set_6 {
    public static void main(String[] args) {
        // practice problem 1
        float[] marks = {57.8f, 45.8f, 92.6f, 99.9f, 50.0f};
        float sum = 0.0f;

        for (float element : marks) {
            sum += element;
        }
        System.out.println("Sum is " + sum);

        // practice problem 2
        int[] mark = {70, 67, 82, 87, 93};
        boolean isInArray = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = sc.nextInt();

        for (int e : mark) {
            if (input == e) {
                isInArray = true;
                break;
            }
        }

        if (isInArray) {
            System.out.println("Your inputted element " + input + " is in the array");
        }
        else {
            System.out.println("Your inputted element " + input + " is not in the array");
        }

        // practice problem 3
        sum = 0.0f;

        for (float element : marks) {
            sum += element;
        }
        System.out.println("The value of average marks is " + sum / marks.length);


        // practice problem 4
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] matrix2 = {
            {13, 15, 78},
            {56, 89, 34}
        };

        int[][] result = {
            {0, 0, 0},
            {0, 0, 0}
        };

        for (int i = 0; i < matrix1.length; i++) { // row number of times
            for (int j = 0; j < matrix1[i].length; j++) { // column number of times
                result[i][j] = matrix1[i][j] + matrix2[i][j]; // adding two matrix of 2x3
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }

        // practice problem 5
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int p : arr) {
            System.out.println(p);
        }

        int temp;
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int p : arr) {
            System.out.println(p);
        }

        // tip for practice problem 6 and 7
        System.out.println("Maximum value of float: " + Float.MAX_VALUE);
        System.out.println("Minimum value of float: " + Float.MIN_VALUE);

        // practice problem 6
        int max = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }

        System.out.println("The max value is " + max);

        // practice problem 7
        int min = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }

        System.out.println("The max value is " + min);

        //practice problem 8

        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}

