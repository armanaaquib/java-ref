package gen;

public interface PairIf<K, V> {
    public K getKey();

    public V getValue();

    public void setValue(V value);
}
