import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int size;

    public void addFirst(int item) {
        var node = new Node(item);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item) {
        var node = new Node(item);
        if (head == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = head;

        while (current != null) {
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public void removeFirst() {
        if (head == null)
            throw new NoSuchElementException();

        if (head == tail) {
            head = tail = null;
        } else {
            var second = head.next;
            head.next = null;
            head = second;
        }

        size--;
    }

    public void removeLast() {
        if (head == null)
            throw new NoSuchElementException();

        if (head == tail) {
            head = tail = null;
        } else {
            var previous = getPrevious(tail);
            tail = previous;
            tail.next = null;
        }

        size--;
    }

    private Node getPrevious(Node node) {
        var current = head;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        int index = 0;
        var current = head;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (head == null)
            return;

        var previous = head;
        var current = head.next;
        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (head == null)
            throw new IllegalStateException();

        var a = head;
        var b = head;

        for (int i = 0; i < k - 1; i++) {
            b = b.next;
            if (b == null)
                throw new IllegalStateException();
        }

        while (b != tail) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    public void printMiddle() {
        if (head == null)
            throw new IllegalStateException();

        var a = head;
        var b = head;

        while (b != tail && b.next != tail) {
            b = b.next.next;
            a = a.next;
        }
        if (b == tail) {
            System.out.println(a.value);
        } else {
            System.out.println(a.value + ", " + a.next.value);
        }
    }
}