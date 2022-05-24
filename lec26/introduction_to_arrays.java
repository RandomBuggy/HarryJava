public class introduction_to_arrays {
    public static void main(String[] args) {
        // array syntax
        // datatype[] array_name = new datatype[size];
        // array is a contiguous memory-block object in java
        // array_name is a reference(pointer) to the object

        int[] marks = new int[5];
        marks[0] = 34;
        marks[1] = 44;
        marks[2] = 54;
        marks[3] = 64;
        marks[4] = 74;
        System.out.println(marks); // will print address
        System.out.println(marks[3]);
        // 3 ways to create an array in java
        // first
        // int[] marks;
        // marks = new int[9];
        // second
        // int[] marks = new int[9];
        // third
        // int[] marks = {12, 13, 14, 15, 16, 17, 18, 19, 20};
    }
}

