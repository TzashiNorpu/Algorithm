package algo.tzashinorpu.Daily.CN;

import java.util.HashSet;
import java.util.PriorityQueue;

public class nthUglyNumber_264 {
    public int nthUglyNumber1(int n) {
        // 1-> 2 3 5
        // 2-> 4 6 10
        // 3-> 6 9 10 -> 10 dup
        int[] nums = {2, 3, 5};
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        set.add(1L);
        pq.add(1L);
        // 1, 2, 3, 4, 5, 6, 8, 9, 10, 12
        for (int i = 0; i < n; i++) {
            Long poll = pq.poll();
            // 默认从小到大出队
//            System.out.println(poll);
            if (i == n - 1) return Math.toIntExact(poll);
            for (int num : nums) {
                long l = poll * num;
                if (!set.contains(l)) {
                    pq.add(l);
                    set.add(l);
                }
            }
        }
        return -1;
    }

    public int nthUglyNumber2(int n) {
        int[] ans = new int[n + 1];
        ans[1] = 1;
        // 1, 2, 3, 4, 5, 6, 8, 9, 10, 12
        for (int i2 = 1, i3 = 1, i5 = 1, idx = 2; idx <= n; idx++) {
            int a = ans[i2] * 2, b = ans[i3] * 3, c = ans[i5] * 5;
            int min = Math.min(a, Math.min(b, c));
            if (a == min) i2++;
            if (b == min) i3++;
            if (c == min) i5++;
            ans[idx] = min;
        }
        return ans[n];
    }
}
