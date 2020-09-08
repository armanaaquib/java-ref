package ihtance;

import java.util.Objects;

public class MountainBike extends Bicycle implements Cloneable{

    private int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        this.seatHeight = startHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public int getSpeed() {
        System.out.println(super.getSpeed());
        return 10 * this.speed;
    }

    public void accessSuperFields() {
        System.out.println(this.publicField);
        System.out.println(this.protectedField);
//        System.out.println(this.privateField);
        System.out.println(this.defaultField);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//
//    @Override
//    protected Object clone() {
//        return new MountainBike(this.seatHeight, this.cadence, this.speed, this.gear);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MountainBike that = (MountainBike) o;
        System.out.println(that.seatHeight);
        return seatHeight == that.seatHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatHeight);
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        final MountainBike mountainBike = new MountainBike(1, 1, 1, 1);
//        mountainBike.accessSuperFields();

//        System.out.println(mountainBike.publicField);
//        System.out.println(mountainBike.protectedField);
////        System.out.println(mountainBike.privateField);
//        System.out.println(mountainBike.defaultField);

        final Object clone = mountainBike.clone();
        System.out.println(clone == mountainBike);
        System.out.println(((MountainBike)clone).publicField);
        System.out.println(mountainBike.equals(clone));
        System.out.println(mountainBike.getClass().getSuperclass().getSimpleName());
    }
}
