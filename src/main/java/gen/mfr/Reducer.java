package gen.mfr;

public interface Reducer<T, U> {
    U reduce(U context, T obj);
}
