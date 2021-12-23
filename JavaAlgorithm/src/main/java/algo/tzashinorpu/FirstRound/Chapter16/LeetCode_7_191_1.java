package algo.tzashinorpu.FirstRound.Chapter16;

public class LeetCode_7_191_1 {
    public int hammingWeight1(int n) {
        /*int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if (((1 << i) & n) >>> i == 1) {
                cnt++;
            }
        }
        return cnt;*/
        n = n - ((n >>> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >>> 2) & 0x33333333);
        n = (n + (n >>> 4)) & 0x0f0f0f0f;
        n = n + (n >>> 8);
        n = n + (n >>> 16);
        return n & 0x3f;
    }
}
