package gen;

public class Pair<K, V> implements PairIf<K, V> {

    private final K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        Pair<Integer, String> p3 = new Pair<>(1, "apple");
        Pair<Integer, Integer> p4 = new Pair<>(4, 4);

        System.out.println(Util.compare(p1, p2));
        System.out.println(Util.compare(p1, p3));

//        System.out.println(Util.<Integer, String>compare(p1, p4));
    }
}
