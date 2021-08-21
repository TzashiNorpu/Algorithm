package algo.tzashinorpu.Week07.Chapter18.AdvancedOrder;

public class QuickOrder {
    public static void sort(int[] arr, int begin, int end) {
        if (end <= begin) {
            return;
        }
        int pivot = partition(arr, begin, end);
        sort(arr, begin, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = end, counter = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;
        return counter;
    }

    public static void main(String[] args) {
        final int[] ints = {3, 2, 1, 7, 20};
        final QuickOrder test = new QuickOrder();
        test.sort(ints,0,4);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
