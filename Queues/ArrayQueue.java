import java.util.Arrays;
import java.util.Stack;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public void implementQueue() {
        // [10, 20, 30, 40, 50]
        var stack = new Stack<Integer>();
        for (int n : items)
            stack.push(n);

        var implementedStack = new Stack<Integer>();

        for (int n : items)
            implementedStack.push(n);
        implementedStack.pop();

        for(int i = 0; i < count; i++)
            items[i] = stack.pop();
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}