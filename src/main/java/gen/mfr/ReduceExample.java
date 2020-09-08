package gen.mfr;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static <T, U> U reduce(List<T> array, Reducer<T, U> reducer, U context) {
        U newContext = context;

        for (T item : array) {
            newContext = reducer.reduce(newContext, item);
        }

        return newContext;
    }

    public static void main(String[] args) {
        Reducer<Integer, Integer> add = Integer::sum;

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        Integer sum = reduce(numbers, add, 0);
        System.out.println(sum.toString());
    }
}
