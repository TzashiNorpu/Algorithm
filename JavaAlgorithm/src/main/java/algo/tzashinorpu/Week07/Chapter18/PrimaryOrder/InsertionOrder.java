package algo.tzashinorpu.Week07.Chapter18.PrimaryOrder;

public class InsertionOrder {
    public int[] sort(int[] arr) {
        int len = arr.length;
        int preIndex, current;
        for (int i = 1; i < len; i++) {
            preIndex = i - 1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }
    public static void main(String[] args) {
        final int[] ints = {3, 22, 1, 7, 20};
        final InsertionOrder test = new InsertionOrder();
        final int[] res = test.sort(ints);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
