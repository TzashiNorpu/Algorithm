package algo.tzashinorpu.Week07.Chapter18.PrimaryOrder;

public class SelectionOrder {
    public int[] sort(int[] arr) {
        int len = arr.length;
        int minIndex, temp;
        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {     // 寻找最小的数
                    minIndex = j;                 // 将最小数的索引保存
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        final int[] ints = {3, 20, 1, 7, 20};
        final SelectionOrder test = new SelectionOrder();
        final int[] res = test.sort(ints);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
