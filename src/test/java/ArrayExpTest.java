import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayExpTest {
    @Test
    public void testArray() {
//        int[] numbers = new int[]{1,2,3,4,5};
        int[] numbers = {1, 2, 3, 4, 5};

//        int n = new Integer();

//        System.out.println(n);

        float[] points;
        points = new float[3];

        assertEquals("float[]", points.getClass().getSimpleName());


        assertTrue(Arrays.equals(numbers, numbers));

        int[][] n = new int[2][];

        n[0] = new int[]{1, 2};
        assertEquals(2, n[0][1]);

        String s = "hello world";
        assertEquals(11, s.length());
        assertEquals(5, numbers.length);

        System.out.println(s.charAt(0));
//        n[0][3] = 4;

//        System.out.println(points);

//        for (float point : points) {
//            System.out.println(point);
//        }

//        for (int number : numbers) {
//            System.out.println(number);
//        }
    }

    private int[] anonymousArrayTaker(int[] array) {
        System.out.println(Arrays.toString(array));
        return array;
    }

    @Test
    public void anonymousArray() {
        assertEquals("[1, 2, 3]", Arrays.toString(anonymousArrayTaker(new int[]{1, 2, 3})));
    }

    @Test
    public void jaggedArray() {
        int[][] array = new int[2][];

        array[0] = new int[]{1};

        array[1] = new int[2];
        array[1][0] = 2;
        array[1][1] = 3;

//        System.out.println(array[0][1]);
        System.out.println(array[1][1]);

        assertTrue(Arrays.deepEquals(new int[][]{{1}, {2, 3}}, array));
        System.out.println(array.getClass().getSimpleName());
        System.out.println(array.getClass().getSuperclass().getSimpleName());
    }

    @Test
    public void arrayCopy() {
        int[] array = {1, 2, 3};

        int[] copyTo = new int[2];

        System.arraycopy(array, 1, copyTo, 0, 2);
        System.out.println(Arrays.toString(copyTo));
        assertEquals(Arrays.toString(new int[]{2, 3}), Arrays.toString(copyTo));

        int[] copyTo2 = Arrays.copyOfRange(array, 1, 3);
        assertEquals(Arrays.toString(new int[]{2, 3}), Arrays.toString(copyTo2));

    }

    @Test
    public void ArraysMethod() {
        int[] array = {1, 2, 3};

        assertEquals(1, Arrays.binarySearch(array, 2));

        Arrays.fill(array, 1);
        assertArrayEquals(new int[]{1, 1, 1}, array);

        Arrays.fill(array, 1, 3, 2);
        assertArrayEquals(new int[]{1, 2, 2}, array);

        String[] strings = {"1", "11", "2"};
        int[] numbers = {1, 11, 2};

        Arrays.sort(strings);
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(numbers));
    }
}
