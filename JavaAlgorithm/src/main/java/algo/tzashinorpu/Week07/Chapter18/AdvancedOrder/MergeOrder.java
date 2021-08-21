package algo.tzashinorpu.Week07.Chapter18.AdvancedOrder;

public class MergeOrder {
    public static void sort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = (left + right) >> 1;

        sort(array, left, mid);
        sort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            temp[k++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            array[left + l] = temp[l];
        }
        // System.arraycopy()...
    }


    public static void main(String[] args) {
        final int[] ints = {3, 2, 1, 7, 20};
        final MergeOrder test = new MergeOrder();
        test.sort(ints, 0, 4);
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
