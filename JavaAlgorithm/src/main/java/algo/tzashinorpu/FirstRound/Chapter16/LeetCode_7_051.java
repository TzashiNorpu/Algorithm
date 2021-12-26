package algo.tzashinorpu.FirstRound.Chapter16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_7_051 {
    private int size;
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
//        size = -1 >>> (32 - n);
        size = (1 << n) - 1;
        LinkedList<Integer> rowStack = new LinkedList<>();
        calcPosByBits(0, 0, 0, rowStack, n);
        return res;
    }

    private void calcPosByBits(int row, int ld, int rd, LinkedList<Integer> rowStack, int n) {
        if (row == this.size) {
            ArrayList<String> strings = new ArrayList<>();
            int size = rowStack.size();
            for (int j = 0; j < size; j++) {
                Integer pop = rowStack.pollFirst();
                String temp = "";
                for (int i = n - 1; i >= 0; i--) {
                    int x = pop >> i & 1;
                    System.out.printf("%d   ", x);
                    temp = (x == 0 ? temp + "." : temp + 'Q');
                }
                strings.add(temp);
                rowStack.addLast(pop);
                System.out.println();
            }
            res.add(strings);
            System.out.println("-----------------");
            return;
        }
        int pos = this.size & (~(row | ld | rd));
        while (pos != 0) {
            int p = pos & (-pos);
            pos = pos - p;
            rowStack.addLast(p);
            calcPosByBits(row | p, (ld | p) << 1, (rd | p) >> 1, rowStack, n);
            rowStack.pollLast();
        }
    }
}