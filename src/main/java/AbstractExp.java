abstract class Sample {
    public static String staticVar = "static";

    public Sample() {
        System.out.println("hello");
    }

    public abstract void demo();
}

class Super1 extends Sample{
    public Super1() {
        super();
    }

    public void demo() {
        System.out.println("demo method of super1");
    }
}

class Super2 extends Sample {
    public void demo() {
        System.out.println("demo method of super2");
    }
}

public class AbstractExp extends Super1 {
    public static void main(String[] args) {
        AbstractExp obj = new AbstractExp();
        obj.demo();
        System.out.println(obj.staticVar);
    }
}
