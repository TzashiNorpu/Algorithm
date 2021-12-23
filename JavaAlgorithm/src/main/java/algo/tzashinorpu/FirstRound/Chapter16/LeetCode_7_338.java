package algo.tzashinorpu.FirstRound.Chapter16;

public class LeetCode_7_338 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int tmp = i;
            tmp = tmp - ((tmp >>> 1) & 0x55555555);
            tmp = (tmp & 0x33333333) + ((tmp >>> 2) & 0x33333333);
            tmp = (tmp + (tmp >>> 4)) & 0x0f0f0f0f;
            tmp = tmp + (tmp >>> 8);
            tmp = tmp + (tmp >>> 16);
            ans[i] = tmp & 0x3f;
        }
        return ans;
    }
}
