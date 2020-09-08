//package ihtance;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class MountainBikeTest {
//
//    @Test
//    public void testInstance() {
//        final MountainBike mountainBike = new MountainBike(1, 1, 1,1);
//
//        assertTrue(mountainBike instanceof MountainBike);
//        assertTrue(mountainBike instanceof Bicycle);
//        assertTrue(mountainBike instanceof Object);
//
//        Object obj = mountainBike;
//
//        assertTrue(obj instanceof MountainBike);
//        assertTrue(obj instanceof Bicycle);
//        assertTrue(obj instanceof Object);
//
//        Object bicycle = mountainBike;
//
//        assertTrue(bicycle instanceof MountainBike);
//        assertTrue(bicycle instanceof Bicycle);
//        assertTrue(bicycle instanceof Object);
////        assertTrue(bicycle instanceof Example);
//
////        Example example = (Example) obj;
//
////        assertTrue(example instanceof MountainBike);
////        assertTrue(example instanceof Bicycle);
////        assertTrue(example instanceof Object);
////        assertTrue(example instanceof Example);
//
////        assertTrue(mountainBike instanceof Example);
//    }
//
//    @Test
//    public void casting() {
//        MountainBike mountainBike = new MountainBike(1,1,1,1);
//
//        assertEquals(1, mountainBike.getSeatHeight());
//        assertEquals(10, mountainBike.getSpeed());
//
//        Object obj = mountainBike;
//
////        assertEquals(1, obj.getSeatHeight());
////        assertEquals(1, obj.getSpeed());
//
//        Bicycle bicycle = mountainBike;
//
////        assertEquals(1, bicycle.getSeatHeight());
//        assertEquals(10, bicycle.getSpeed());
//
//        mountainBike = (MountainBike) obj;
//        assertEquals(1, mountainBike.getSeatHeight());
//        assertEquals(10, mountainBike.getSpeed());
//
////        Example example = (Example) obj;
//        bicycle = (Bicycle) obj;
//
//        assertEquals(10, bicycle.getSpeed());
//    }
//}
