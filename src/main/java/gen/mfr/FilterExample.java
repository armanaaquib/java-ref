package gen.mfr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static <T> ArrayList<T> filter(ArrayList<T> array, Predicate<T> predicate) {
        ArrayList<T> newArray = new ArrayList<>();

        for (T item : array) {
            if (predicate.check(item)) {
                newArray.add(item);
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        Predicate<Integer> evenPredicate = number -> number % 2 == 0;

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        ArrayList<Integer> evens = filter(new ArrayList<>(numbers), evenPredicate);

        System.out.println(evens.toString());
    }
}
