package gen.ll;

public class LinkedList<T> {
    private Node<T> start;
    private Node<T> end;

    LinkedList() {
        this.start = null;
        this.end = null;
    }

    public boolean insertAtEnd(T data) {
        Node<T> node = new Node<>(data);

        if (this.start == null) {
            this.start = node;
        } else {
            this.end.next = node;
        }

        this.end = node;

        return true;
    }

    public boolean insertAtBeginning(T data) {
        Node<T> node = new Node<>(data);

        node.next = this.start;
        this.start = node;

        if (this.end == null) {
            this.end = node;
        }

        return true;
    }

    public T removeFromLast() {
        Node<T> removedNode = this.end;

        if (this.start == this.end) {
            this.start = null;
            this.end = null;
        } else {
            Node<T> secondLastNode = this.start;

            while (secondLastNode.next != this.end) {
                secondLastNode = secondLastNode.next;
            }

            secondLastNode.next = null;
            this.end = secondLastNode;
        }

        return removedNode.data;
    }

    public T removeFromBeginning() {
        if(this.start != null) {
            Node<T> removedNode = this.start;

            if (this.end == this.start) {
                this.end = null;
            }

            this.start = this.start.next;
            return removedNode.data;
        }

        return null;
    }

    private void display() {
        Node<T> pWalk = this.start;

        while (pWalk != null) {
            System.out.println(pWalk.data);
            pWalk = pWalk.next;
        }
    }

    public static void main(String[] args) {
        final LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insertAtEnd("Hello 3");
        stringLinkedList.insertAtEnd("Hello 4");
        stringLinkedList.display();
        System.out.println();

        stringLinkedList.insertAtBeginning("Hello 2");
        stringLinkedList.insertAtBeginning("Hello 1");
        stringLinkedList.display();
        System.out.println();
//
//
        stringLinkedList.removeFromLast();
        stringLinkedList.removeFromLast();
        stringLinkedList.display();
        System.out.println();

        stringLinkedList.insertAtEnd("Hello 3");
        stringLinkedList.removeFromBeginning();
        stringLinkedList.display();
        System.out.println();
    }
}
