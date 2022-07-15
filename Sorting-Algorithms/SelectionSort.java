public class SelectionSort {
    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++)
            swap(array, findMinIndex(array, i), i);
    }

    private int findMinIndex(int[] array, int startIndex) {
        var minIndex = startIndex;

        for (var i = startIndex; i < array.length; i++)
            if (array[i] < array[minIndex])
                minIndex = i;

        return minIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}