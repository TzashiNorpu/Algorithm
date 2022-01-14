package algo.tzashinorpu.Daily.CN;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthSmallestPrimeFraction_786 {
    /*输入：arr = [1,2,3,5], k = 3
    输出：[2,5]
    解释：已构造好的分数,排序后如下所示:
    1/5, 1/3, 2/5, 1/2, 3/5, 2/3
    第三个最小的分数是 2/5*/

    public int[] kthSmallestPrimeFractionHeap(int[] arr, int k) {
        // 1/2 1/3 1/5 2/3 2/5 3/5
        // 1/2 1/3 1/5   2/3>1/2
        // 1/2 1/3 1/5   2/5<1/2
        // 2/5 1/3 1/5   3/5>2/5
        int len = arr.length;
        // 大顶堆
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0] * 1.0 / b[1], a[0] * 1.0 / a[1]));
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                double t = arr[i] * 1.0 / arr[j];
                if (pq.size() < k || t < pq.peek()[0] * 1.0 / pq.peek()[1]) {
                    if (pq.size() == k) pq.poll();
                    pq.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return pq.poll();
    }

    public int[] kthSmallestPrimeFractionMerge(int[] arr, int k) {
        int len = arr.length;
        // 小顶堆
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Double.compare(arr[a[0]] * 1.0 / arr[a[1]], arr[b[0]] * 1.0 / arr[b[1]]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingDouble(a -> arr[a[0]] * 1.0 / arr[a[1]]));
        for (int i = 1; i < len; i++) {
            pq.add(new int[]{0, i});
        }
        while (k-- > 1) {
            int[] poll = pq.poll();
            int i = poll[0];
            int j = poll[1];
            if (i + 1 < j) pq.add(new int[]{i + 1, j});
        }
        int[] poll = pq.poll();
        return new int[]{arr[poll[0]], arr[poll[1]]};
    }

    private double eps = 10e-8;
    private int a = 0;
    private int b = 0;

    public int[] kthSmallestPrimeFractionBisection(int[] arr, int k) {
        double l = 0, r = 1;
        while (r - l > eps) {
            double mid = (r + l) / 2;
            if (check(mid, arr) >= k) {
                r = mid;
            } else {
                l = mid;
            }
        }
        return new int[]{a, b};
    }

    private int check(double x, int[] arr) {
        // 1, 2, 3, 5
        // 统计 <= x 的计数
        int ans = 0;
        // x = 0.6
        // x = 0.3
        for (int i = 0, j = 1; j < arr.length; j++) {
            while (arr[i + 1] * 1.0 / arr[j] <= x) i++;
            if (arr[i] * 1.0 / arr[j] <= x) ans += i + 1;
            if (Math.abs(arr[i] * 1.0 / arr[j] - x) <= eps) {
                this.a = arr[i];
                this.b = arr[j];
            }
        }
        return ans;
    }
}
