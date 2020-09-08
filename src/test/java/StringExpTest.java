import com.sun.xml.internal.bind.v2.TODO;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringExpTest {
    @Test
    public void testString() {
        final String random = new String("random");
        assertEquals("random", random);
    }

    @Test
    public void testCharAt() {
        final String random = "random";
        final char c = random.charAt(1);

        assertEquals('a', c);
    }

    @Test
    public void testContains() {

        final String random = "random";
        assertTrue(random.contains("n"));
        assertTrue(random.contains("do"));
        assertFalse(random.contains("don"));
    }

    @Test
    public void testCopyValueOf() {
        char[] chars = {'r', 'a', 'n', 'd', 'o', 'm'};
        assertEquals("random", String.copyValueOf(chars));
        assertEquals("and", String.copyValueOf(chars, 1, 3));
    }

    @Test
    public void testEndsWith() {
        String random = "random";

        assertTrue(random.endsWith("om"));
        assertTrue(random.endsWith("m"));
        assertFalse(random.endsWith("r"));
    }

    @Test
    public void testIndexOf() {
        final String random = "Hello World";

        assertEquals(4, random.indexOf('o'));
        assertEquals(7, random.indexOf('o', 5));
        assertEquals(2, random.indexOf("llo"));
        assertEquals(-1, random.indexOf("llo", 3));
    }

    @Test
    public void testIsEmpty() {
        String emptyString = "";
        String notEmptyString = "not empty";

        assertTrue(emptyString.isEmpty());
        assertFalse(notEmptyString.isEmpty());
    }

    @Test
    public void testLasIndexOf() {
        final String random = "Hello World";

        assertEquals(7, random.lastIndexOf('o'));
        assertEquals(4, random.lastIndexOf('o', 5));
        assertEquals(2, random.lastIndexOf("llo"));
        assertEquals(2, random.lastIndexOf("llo", 2));

    }

    @Test
    public void testReplace() {
        //TODO look at it
        // two
        String random = "Hello World";

        assertEquals("Hekko Workd", random.replace('l', 'k'));
        assertEquals("Hello Universe", random.replace("World", "Universe"));
        assertEquals("Hello World", random.replace("world", "Universe"));
    }

    @Test
    public void testSplit() {
        String random = "Hello World !";

        // FIXME fix it
        //  one
        //  two
        String[] strings = random.split(" ");

        assertEquals("Hello", strings[0]);
        assertEquals("World", strings[1]);
        assertEquals("!", strings[2]);

        strings = random.split(" ", 2);
        assertEquals("Hello", strings[0]);
        assertEquals("World !", strings[1]);
    }

    @Test
    public void testStartsWith() {
        String random = "random";

        assertTrue(random.startsWith("ra"));
        assertTrue(random.startsWith("r"));
        assertFalse(random.startsWith("m"));

        assertTrue(random.startsWith("n", 2));
        assertFalse(random.startsWith("r", 3));
    }

    @Test
    public void testSubstring() {
        String random = "random";

        assertEquals("ra", random.substring(0, 2));
        assertEquals("dom", random.substring(3));

    }

    @Test
    public void testTrim() {
        String random = " random \t";

        assertEquals("random", random.trim());
    }

    @Test
    public void testValueOf() {
        assertEquals("true", String.valueOf(true));
        assertEquals("10", String.valueOf(10));
        assertEquals("a", String.valueOf('a'));
        assertEquals("1.21", String.valueOf(1.21f));
    }
}