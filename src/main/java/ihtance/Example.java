package ihtance;

public class Example {
    public static void main(String[] args) {
        final MountainBike mountainBike = new MountainBike(1, 1, 1, 1);
        mountainBike.accessSuperFields();

        Bicycle bike = new Bicycle(1,1,1);

        System.out.printf(bike.publicField);
        System.out.printf(bike.protectedField);
//        System.out.printf(bike.privateField);
        System.out.printf(bike.defaultField);

        System.out.println(mountainBike.publicField);
        System.out.println(mountainBike.protectedField);
//        System.out.println(mountainBike.privateField);
        System.out.println(mountainBike.defaultField);

    }

    public int exp() {
        return 1;
    }
}
