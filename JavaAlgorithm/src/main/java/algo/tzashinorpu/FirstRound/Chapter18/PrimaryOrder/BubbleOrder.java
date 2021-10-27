package algo.tzashinorpu.FirstRound.Chapter18.PrimaryOrder;

public class BubbleOrder {
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {        // 相邻元素两两对比
                    int temp = arr[j+1];        // 元素交换
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        final int[] ints = {3, 2, 1, 7, 20};
        final BubbleOrder test = new BubbleOrder();
        final int[] res = test.sort(ints);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
