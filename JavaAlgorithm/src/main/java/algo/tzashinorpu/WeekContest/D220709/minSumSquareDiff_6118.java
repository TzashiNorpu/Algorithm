package algo.tzashinorpu.WeekContest.D220709;

import java.util.Arrays;

public class minSumSquareDiff_6118 {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int k = k1 + k2;
        int n = nums1.length;
        long ans = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Math.abs(nums1[i] - nums2[i]);
        }
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (k == 0) break;
            if (k > a[i]) {
                a[i] = 0;
                k -= a[i];
            } else {
                a[i] -= k;
                k = 0;
            }
            ans += (long) a[i] * a[i];
        }
        return ans;
    }
}
