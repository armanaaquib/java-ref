package com.example;

import ihtance.Bicycle;
import ihtance.MountainBike;

public class Ihtance extends Bicycle {
    public void accessSuperFields() {
        System.out.println(this.publicField);
        System.out.println(this.protectedField);
//        System.out.println(this.privateField);
//        System.out.println(this.defaultField);
    }

    public static void main(String[] args) {
        final MountainBike mountainBike = new MountainBike(1, 1, 1, 1);
        mountainBike.accessSuperFields();

        System.out.println(mountainBike.publicField);
//        System.out.println(mountainBike.protectedField);
//        System.out.println(mountainBike.privateField);
//        System.out.println(mountainBike.defaultField);
    }
}
