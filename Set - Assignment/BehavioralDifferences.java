//Write a program to check the difference between HashSet and TreeSet in terms of performance.

import java.util.*;
public class BehavioralDifferences {
    public static void main(String[] args){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(15);
        hs.add(12);
        hs.add(170);
        hs.add(100);
        hs.add(200);
        System.out.println(hs);//insertion order is not preserved
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(10);
        ts.add(15);
        ts.add(12);
        ts.add(170);
        ts.add(100);
        ts.add(200);
        System.out.println(ts);//insertion order is preserved

    }
}

