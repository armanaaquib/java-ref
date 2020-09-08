package iface;

//import inheritance.Super;
//import java.io.Serializable;

public class Rectangle implements Relatable, CharSequence{
    public int width;
    public int height;

    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    public int area() {
        System.out.println(Relatable.super.defaultMethod());
//        System.out.println(Relatable.super.isLargerThan((Relatable) this));
        return width * height;
    }
                                                                                            
    // a method required to implement
    // the Relatable interface
    @Override
    public int isLargerThan(Relatable other) {
        Rectangle otherRect = (Rectangle) other;

        return Integer.compare(this.area(), otherRect.area());
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0,2);
        Rectangle r2 = new Rectangle(2,2);

//        System.out.println(r1.isLargerThan(r2));

//        Super s = new Super();
//        s.show();
//        Relatable rb1 = (Relatable)s;
//        Relatable rb2 = (Relatable)r1;
//        System.out.println(rb1.isLargerThan(r1));
//        System.out.println(rb2.isLargerThan(r2));

//        System.out.println(r1.defaultMethod());
//        System.out.println(Relatable.staticMethod());
        // r1.staticMethod();

        r1.area();

//        Serializable
    }
}
