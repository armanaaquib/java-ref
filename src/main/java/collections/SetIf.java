package collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetIf {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 4));
        System.out.println(c.toString());

//        Set<Integer> noDups = new HashSet<>(c);
//        System.out.println(noDups);
//
//        noDups.add(1);
//        System.out.println(noDups);

        System.out.println(c.stream().collect(Collectors.toSet()).toString());
        System.out.println(c.stream().collect(Collectors.toCollection(TreeSet::new)).toString());
    }
}
