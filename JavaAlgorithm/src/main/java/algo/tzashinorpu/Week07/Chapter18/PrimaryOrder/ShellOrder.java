package algo.tzashinorpu.Week07.Chapter18.PrimaryOrder;

public class ShellOrder {
    public int[] sort(int[] arr) {
        int len = arr.length;
        for (int gap =  len / 2; gap > 0; gap = gap / 2) {
            // 注意：这里和动图演示的不一样，动图是分组执行，实际操作是多个分组交替执行
            for (int i = gap; i < len; i++) {
                int j = i;
                int current = arr[i];
                while (j - gap >= 0 && current < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = current;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        final int[] ints = {3, 2, 1, 7, 20};
        final ShellOrder test = new ShellOrder();
        final int[] res = test.sort(ints);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
