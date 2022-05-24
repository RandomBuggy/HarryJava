import java.util.Scanner;
import java.util.ArrayList;

/* generics are similar to c++ templates.
 * mostly we use built-in java Generic class
 * generics enhance data-type security and unwanted bug
 * for generics-typeParameter use Class Type not Premitive like Integer not int
 */

class MyGeneric<T> {
    private T val;

    public MyGeneric(T val) {
        this.val = val;
    }
    public void setVal(T val) {
        this.val = val;
    }
    public T getVal() {
        return this.val;
    }
}

public class java_generics {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.print("Enter Integer : ");
        for (int i = 0; i < 5; i++) {
            ar.add((new Scanner(System.in).nextInt()));
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(ar.get(i));
        }

        MyGeneric<String> generic = new MyGeneric<>("Generic String");
        System.out.println(generic.getVal());
        generic.setVal("Witj Setter");
        System.out.println(generic.getVal());
    }
}

