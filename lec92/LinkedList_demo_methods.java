import java.util.*;

public class LinkedList_demo_methods {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(9);
        l1.add(78);
        l1.add(33);
        l1.add(5);
        l1.add(67);
        l1.add(12);
        l1.add(88);
        l1.add(45);
        l1.add(/*index*/ 1, /* element */ 44);
        l1.add(/*index*/ 1, /* element */ 64);
        l1.add(88);
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        l1.addLast(60000);
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(789);
        l2.add(456);
        l2.add(123);
        l1.addAll(l2);
        for(int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        l1.addAll(0, l2);
        for(int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        System.out.println("size : " + l2.size());
        l2.clear();
        System.out.println("size : " + l2.size());
        System.out.println(l1.indexOf(88));
        System.out.println(l1.lastIndexOf(88));
        l1.set(3, 5000);
        System.out.println(l1.indexOf(5000));

    }
}

