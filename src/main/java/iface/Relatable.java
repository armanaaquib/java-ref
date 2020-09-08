package iface;

public interface Relatable {
    // this (object calling isLargerThan)
    // and other must be instances of
    // the same class returns 1, 0, -1
    // if this is greater than,
    // equal to, or less than other
    int isLargerThan(Relatable other);

    default String defaultMethod() {
        return "default";
    }

    static String staticMethod() {
        return "static";
    }
}
