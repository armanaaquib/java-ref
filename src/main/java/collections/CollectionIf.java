package collections;


import gen.mfr.Predicate;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionIf {

    public static <T> void filter(Collection<T> c, Predicate<T> predicate) {
        c.removeIf(t -> !predicate.check(t));

//        for (Iterator<T> it = c.iterator(); it.hasNext() ;) {
//            if(!predicate.check(it.next())) {
//                it.remove();
//            }
//        }
    }

    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>(Arrays.asList(1, 2, 3));

        List<Integer> list = new ArrayList<>(coll);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        list.stream().map(Object::toString).forEach(System.out::println);
        System.out.println(list.stream().map(Object::toString).collect(Collectors.joining(",")));

        filter(coll, n -> n % 2 == 0);
        System.out.println(coll.toString());

        final Collection<Integer> integers = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] s = integers.toArray(new Integer[0]);
//        integers.add("Hello");
        Object[] obj = integers.toArray();
        Integer[] s1 = integers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(s));
    }
}
