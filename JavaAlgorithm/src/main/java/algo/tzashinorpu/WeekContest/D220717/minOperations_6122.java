package algo.tzashinorpu.WeekContest.D220717;

import java.util.Arrays;

public class minOperations_6122 {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        Arrays.sort(numsDivide);
        int gcd = numsDivide[0];
        for (var num : numsDivide) gcd = Math.min(gcd, gcd(gcd, num));
        int i = 0;
        for (; i < nums.length; i++) {
            if (gcd % nums[i] == 0) return i;
        }
        return -1;
    }

    int gcd(int m, int n) {
        if (m < n) {
            int k = m;
            m = n;
            n = k;
        }
        return m % n == 0 ? n : gcd(n, m % n);
    }
}
