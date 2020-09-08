package iclass;

import com.sun.jdi.event.EventIterator;

import java.util.Iterator;

public class DataStructure {
    private final static int SIZE = 15;
    private final int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        EvenIterator iterator = this.new EvenIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.nextIndex);
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

    }


    private class EvenIterator implements Iterator {
        private int nextIndex;

        EvenIterator() {
            this.nextIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return this.nextIndex < SIZE;
        }

        @Override
        public Integer next() {
            int returnValue = DataStructure.this.arrayOfInts[nextIndex];
            this.nextIndex += 2;
            return returnValue;
        }
    }

    public static class StaticNestedClass{
        private final String name;
        public StaticNestedClass() {
            this.name = "static nested class";
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();


        final EvenIterator evenIterator = ds.new EvenIterator();
        System.out.println(evenIterator.nextIndex);
        // Static nested class
        final DataStructure.StaticNestedClass staticNestedClass = new DataStructure.StaticNestedClass();
        System.out.println(staticNestedClass.name);

    }
}
