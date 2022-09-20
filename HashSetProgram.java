import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(); 

        // add 
        set.add(1);
        set.add(3);
        set.add(2);

        // print set
        System.out.println(set);

        // print size of set
        System.out.println("Size of Set: " + set.size());

        // searching in set
        if (set.contains(2)) System.out.println("Element found in set.");
        else System.out.println("Element not found.");

        // removing element from set
        set.remove(2);
        System.out.println("Set after removing 2: " + set);

        // Iterating through set
        Iterator it = set.iterator();
        while (it.hasNext()) System.out.println(it.next());

        // isEmpty
        if (set.isEmpty()) System.out.println("Set is Empty.");
        else System.out.println("Set is not Empty.");

        // Iterating through set using for each loop
        for (Integer i: set) {
            System.out.println(i);
        }
    }
}
