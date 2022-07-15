import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = { 7, 3, 1, 6, 3, 1, 5, 2, 4 };
        // var sorter = new BubbleSort();
        // var sorter = new SelectionSort();
        // var sorter = new InsertionSort();
        // var sorter = new MergeSort();
        // var sorter = new QuickSort();
        // var sorter = new CountingSort();
        // sorter.sort(array, 7);
        var sorter = new BucketSort();
        sorter.sort(array, 5);
        System.out.println(Arrays.toString(array));
    }
}