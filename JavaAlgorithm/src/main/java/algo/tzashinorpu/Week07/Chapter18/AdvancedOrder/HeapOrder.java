package algo.tzashinorpu.Week07.Chapter18.AdvancedOrder;

public class HeapOrder {
    public static void sort(int[] array) {
        if (array.length == 0) {
            return;
        }
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(array, length, i);
        }

        for (int i = length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int length, int i) {
        int left = 2 * i + 1, right = 2 * i + 2;
        int largest = i;

        if (left < length && array[left] > array[largest]) {
            largest = left;
        }
        if (right < length && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static void main(String[] args) {
        final int[] ints = {3, 2, 1, 7, 20};
        final HeapOrder test = new HeapOrder();
        test.sort(ints);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
