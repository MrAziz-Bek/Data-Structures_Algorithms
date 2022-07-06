import java.util.ArrayDeque;
import java.util.Arrays;
// import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // var queue = new ArrayDeque<Integer>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);

        // reverse(queue);
        // for (Integer n : queue) {
        //     System.out.println(n);
        // }

        // ArrayQueue queue = new ArrayQueue(5);
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // queue.enqueue(40);
        // queue.enqueue(50);
        // queue.enqueue(60);
        // queue.enqueue(70);
        // System.out.println(queue.toString());

        // var queue = new QueueWithTwoStacks();
        // queue.enqueue(10);
        // queue.enqueue(20);
        // queue.enqueue(30);
        // queue.dequeue();
        // System.out.println(queue.dequeue());

        // PriorityQueue<Integer> queue = new PriorityQueue<>();
        // queue.add(5);
        // queue.add(1);
        // queue.add(3);
        // queue.add(2);

        // while(!queue.isEmpty()) {
        //     System.out.println(queue.remove());
        // }

        PriorityQueue queue = new PriorityQueue(5);
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        System.out.println(queue.toString());

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    public static void reverse(Queue<Integer> queue) {
        var stack = new Stack<Integer>();

        while(!queue.isEmpty())
            stack.push(queue.remove());

        while(!stack.isEmpty())
            queue.add(stack.pop()); 
    }
}