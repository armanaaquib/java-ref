package gen.mfr;

public interface Mapper<T, U> {
    U map(T obj);
}
