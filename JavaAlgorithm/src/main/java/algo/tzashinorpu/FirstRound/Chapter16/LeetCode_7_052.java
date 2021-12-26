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
        solve(0, 0, 0, 0);
        return count;
    }

    // 放皇后的位置
    private void solve(int row, int ld, int rd, int level) {
        if (row == size) {
            count++;
            return;
        }
        // 当前层能放皇后的位置   撇攻击范围     捺攻击范围
        int pos = size & (~(row | ld | rd));
     /*   System.out.printf("pos =%4s,row=%4s,ld=%4s,rd=%4s,level=%d\n",
                Integer.toBinaryString(pos), Integer.toBinaryString(row), Integer.toBinaryString(ld), Integer.toBinaryString(rd), level);*/
        while (pos != 0) {
            // 当前层选一个位置放皇后
            int p = pos & (-pos);
            // 放了皇后后更新当前层能放皇后的位置
            pos -= p;
           /* System.out.printf("p=%4s,new pos =%4s,level=%d\n"
                    , Integer.toBinaryString(p), Integer.toBinaryString(pos), level);*/
            // 由于是斜线的攻击范围 当前的 ld/rd 在下一行的攻击范围需要 左移/右移
            solve(row | p, (ld | p) << 1, (rd | p) >> 1, level++);
        }
    }
}