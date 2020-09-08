package com.example;

import ihtance.Bicycle;
import ihtance.MountainBike;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer n1 = 127;
        Integer n2 = 127;
        Integer n3 = 128;
        Integer n4 = 128;
        System.out.println(n1 == n2);
        System.out.println(n3 == n4);
        System.out.println("Hello World!");

        final MountainBike mountainBike = new MountainBike(1, 1, 1, 1);
        mountainBike.accessSuperFields();

        Bicycle bike = new Bicycle(1, 1, 1);

        System.out.printf(bike.publicField);
//        System.out.printf(bike.protectedField);
//        System.out.printf(bike.privateField);
//        System.out.printf(bike.defaultField);

        System.out.println(mountainBike.publicField);
//        System.out.println(mountainBike.protectedField);
//        System.out.println(mountainBike.privateField);
//        System.out.println(mountainBike.defaultField);


        float a = 2.2f;
//
//        switch (a){
//
//        }

        final ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        numbers.forEach(n -> System.out.println(n));
    }
}
