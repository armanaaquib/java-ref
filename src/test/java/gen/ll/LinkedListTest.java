package gen.ll;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void addLast() {
        final LinkedList<String> stringLinkedList = new LinkedList<>();
        assertTrue(stringLinkedList.insertAtEnd("Hello 3"));
    }

    @Test
    public void addStart() {
        final LinkedList<String> stringLinkedList = new LinkedList<>();
        assertTrue(stringLinkedList.insertAtBeginning("Hello 3"));
    }

    @Test
    public void removeLast() {
        final LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.insertAtEnd("Hello 1");
        stringLinkedList.insertAtEnd("Hello 2");

        assertEquals("Hello 2",stringLinkedList.removeFromLast());
    }

    @Test
    public void removeFirst() {
        final LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.insertAtEnd("Hello 1");
        stringLinkedList.insertAtEnd("Hello 2");

        assertEquals("Hello 1",stringLinkedList.removeFromBeginning());
    }
}