import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NullHandlingInSets {
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add(null);//Allows one null
        hs.add("a");
        hs.add(null);//ignores second null
        System.out.println(hs);

        LinkedHashSet<String> ls=new LinkedHashSet<>();
        ls.add(null);//Allows one null
        ls.add("h");
        ls.add(null);//ignores second null
        System.out.println(ls);

        TreeSet<String> ts=new TreeSet<>();
       try {
            ts.add(null); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("TreeSet: Cannot add null (throws NullPointerException)");
        }
    }
}
