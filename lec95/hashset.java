import java.util.*;

public class hashset {
    public static void main(String[] args) {
        System.out.println("");
        // HashSet<Integer> myHashSet = new HashSet<>();
        // HashSet<Integer> myHashSet = new HashSet<>(6);
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);
        myHashSet.add(11);
        System.out.println(myHashSet);
    }
}

