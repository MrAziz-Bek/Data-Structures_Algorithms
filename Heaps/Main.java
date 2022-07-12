import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Heap heap = new Heap(10);
        // heap.insert(10);
        // heap.insert(5);
        // heap.insert(17);
        // heap.insert(4);
        // heap.insert(22);
        // System.out.println(heap.remove());

        // int[] numbers = { 5, 3, 8, 4, 1, 2 };
        // var heap = new Heap(numbers.length);
        // for (int number : numbers)
        // heap.insert(number);

        // for (int i = numbers.length - 1; i >= 0; i--)
        // numbers[i] = heap.remove();

        // System.out.println(Arrays.toString(numbers));

        // int[] numbers = { 5, 3, 8, 4, 1, 2 };
        // MaxHeap.heapify(numbers);
        // System.out.println(Arrays.toString(numbers));

        int[] numbers = { 5, 3, 8, 4, 1, 2 };

        System.out.println(MaxHeap.getKthLargest(numbers, 1));
    }
}