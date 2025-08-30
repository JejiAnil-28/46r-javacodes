import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{10, 20, 10, 30, 40, 20, 50, 30};
        List<Integer> numbers = Arrays.asList(arr);

        System.out.println("Original List: " + numbers);

        Set<Integer> uniqueSet = new LinkedHashSet<>(numbers);

        List<Integer> uniqueList = new ArrayList<>(uniqueSet);

        System.out.println("List after removing duplicates: " + uniqueList);
    }
}