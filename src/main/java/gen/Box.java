package gen;

import java.util.Collection;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public class Box<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public <U extends Number > void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
//        Box<Integer> intBox = new Box<>();
//        Box rawBox = new Box();
//
//        intBox.setT(10);
//        System.out.println(intBox.getT());
//
//        rawBox.setT(20);
//        rawBox.setT("String");
//        System.out.println(intBox.getT());
//
//        rawBox = intBox;
//        System.out.println(rawBox.getT());

        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setT(new Integer(10));

        integerBox.inspect(10.2f);
//        integerBox.inspect("some text");

//        final Collection<Integer> integers = new Collection<>();

    }
}
