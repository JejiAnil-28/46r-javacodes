//Write a Java program to use TreeSet to store student names and display them in alphabetical order.

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("vamsi");
        ts.add("Ravi");
        ts.add("Harsha");
        ts.add("Nani");
        ts.add("Anil");
        ts.add("Karthik");

        System.out.println(ts);
    }
}
