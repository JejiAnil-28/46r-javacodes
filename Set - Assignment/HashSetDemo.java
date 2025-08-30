// Write a Java program to demonstrate the working of HashSet by adding, removing, and displaying elements.

import java.util.HashSet;

class HashSetDemo{
    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>();
        System.out.println(hs.size());
        System.out.println(hs); 
        for(int i=1;i<=10;i++){
            hs.add(i);
        }
        System.out.println("After Adding Elements to Hashset : ");
        System.err.println(hs);
        System.out.println(hs.size());

        System.out.println("Remove elements from Hashset :");
        hs.remove(9);
        hs.remove(4);

        System.err.println(hs);
    }
}