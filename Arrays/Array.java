public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 0; i < count; i++) {
            if (max < items[i])
                max = items[i];
        }
        return max;
    }

    public Array intersect(Array other) {
        Array intersect = new Array(count);
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < other.count; j++) {
                if (items[i] == items[j])
                    intersect.insert(items[i]);
            }
        }
        return intersect;
    }

    public void reverse() {
        int i = 0, j = count - 1;
        for (; i < j; i++, j--) {
            int temp = items[i];
            items[i] = items[j];
            items[j] = temp;
        }
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        items = new int[count + 1];
        count++;
        for (int i = count - 1; i > index; i--)
            items[i] = items[i - 1];
        items[index] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}