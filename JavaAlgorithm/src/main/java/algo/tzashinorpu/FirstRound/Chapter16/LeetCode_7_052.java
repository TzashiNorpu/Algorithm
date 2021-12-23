package algo.tzashinorpu.FirstRound.Chapter16;

public class LeetCode_7_052 {
    private int count;
    private int size;

    public int totalNQueens(int n) {
        count = 0;
        // 1 n=4->size=01111
        size = (1 << n) - 1;
        solve(0, 0, 0);
        return count;
    }

    private void solve(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        // 当前层能放皇后的位置
        //1 1111
        int pos = size & (~(row | ld | rd));
        while (pos != 0) {
            // 选一个位置放皇后
            // 000..0001111 & 111...110001 ->000...0001
            int p = pos & (-pos);
            // 放了皇后后当前层
            // 1110
            pos -= p;
            // 0001   0010  0000
            solve(row | p, (ld | p) << 1, (rd | p) >> 1);
        }
    }
}