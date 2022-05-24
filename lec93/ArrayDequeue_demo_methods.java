import java.util.*;

public class ArrayDequeue_demo_methods {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = ArrayDeque<>();
        ad.add(69);
        ad.add(3);
        ad.add(5);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        ad.addFist(1);
        System.out.println(ad.getFirst());
    }
}

