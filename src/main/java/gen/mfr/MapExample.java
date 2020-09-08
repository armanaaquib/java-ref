package gen.mfr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static <T, U> ArrayList<U> map(ArrayList<T> array, Mapper<T, U> mapper) {
        ArrayList<U> newArray = new ArrayList<>();

        for (T item : array) {
            newArray.add(mapper.map(item));
        }

        return newArray;
    }

    public static void main(String[] args) {
        Mapper<Integer, Double> sqrt = Math::sqrt;

        List<Integer> numbers = Arrays.asList(1, 2, 3);

        ArrayList<Double> sqrts = map(new ArrayList<>(numbers), sqrt);

        System.out.println(sqrts.toString());
    }
}
