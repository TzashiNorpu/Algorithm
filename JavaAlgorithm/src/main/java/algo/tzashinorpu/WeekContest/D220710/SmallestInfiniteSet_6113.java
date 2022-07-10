package algo.tzashinorpu.WeekContest.D220710;

public class SmallestInfiniteSet_6113 {
    int[] arr = new int[1001];
    int minIndex = 1;

    public SmallestInfiniteSet_6113() {
        for (int i = 1; i <= 1000; i++) {
            arr[i] = i;
        }
    }

    public int popSmallest() {
        int v = arr[minIndex];
        arr[minIndex] = 0;
        for (int i = minIndex + 1; i < 1001; i++) {
            if (arr[i] != 0) {
                minIndex = i;
                break;
            }
        }
        return v;
    }

    public void addBack(int num) {
        arr[num] = num;
        if (num < minIndex) minIndex = num;
    }
}
