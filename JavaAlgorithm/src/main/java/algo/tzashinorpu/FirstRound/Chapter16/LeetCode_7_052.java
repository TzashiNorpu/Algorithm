package algo.tzashinorpu.FirstRound.Chapter16;

public class LeetCode_7_052 {
    private int count;
    private int size;
//    *   *   *   +  0001 0010  0000()
//    *   *   *   *
//    *   *   *   *
//    *   *   *   *

    public int totalNQueens(int n) {
        count = 0;
        // 1 n=4->size=01111
        size = (1 << n) - 1;
        solve(0, 0, 0);
        return count;
    }

    // 放皇后的位置
    private void solve(int row, int ld, int rd) {
        if (row == size) {
            count++;
            return;
        }
        // 当前层能放皇后的位置   撇攻击范围     捺攻击范围
        int pos = size & (~(row | ld | rd));
        while (pos != 0) {
            // 当前层放皇后位置
            // 1100 & 0100
            int p = pos & (-pos);
            // 放了皇后后更新当前层能放皇后的位置
            pos -= p;
//            solve(row | p, (ld | p) << 1, (rd | p) >> 1);
            solve(row | p, (p << 1) | ld & (-1 >>> 28), rd | (p >> 1) & (-1 >>> 28));
            //   row=0000     ld=0000  rd=0000  pos=1111 p=0001  new pos=1110  ->2
            //   row=0001     ld=0010  rd=0000  pos=1100 p=0100  new pos=1000  ->1
            //   row=0101     ld=1010  rd=0010  pos=0000
            //1->pos=1000     p=1000   row=0001     ld=0010  rd=0000
            //   row=1001     ld=0010  rd=0100
            //   pos=0
            //2->pos=1110     p=0010   row=0000     ld=0000  rd=0000  new pos=1100
            //   pos=1100     p=0100   row=0010     ld=0100  rd=0001  new pos=1000
            //   row=0010     ld=0100  rd=0001  pos=1000 p=0010
        }
    }
}