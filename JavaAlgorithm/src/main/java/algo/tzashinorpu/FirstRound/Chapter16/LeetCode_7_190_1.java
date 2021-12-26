package algo.tzashinorpu.FirstRound.Chapter16;

public class LeetCode_7_190_1 {
    public int reverseBits(int n) {
        // 43261596=0000 0010 1001 0100 0001 1110 1001 1100
        // 964176192=00111001011110000010100101000000
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = res << 1;
            // 取出 n 的最后一位更新到 res 中
            res = res | (n & 1);
            n = n >> 1;
        }
        return res;
    }
}
