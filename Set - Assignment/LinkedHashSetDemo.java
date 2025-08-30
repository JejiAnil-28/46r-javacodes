//Create a LinkedHashSet and show how it maintains the insertion order.

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(5);
        set.add(2);
        set.add(100);
        set.add(25);
        set.add(50);
        set.add(100);
        System.out.println("LinkedHashSet Maintains Insertion Order : ");
        System.out.println(set);
    }
}
