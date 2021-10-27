package algo.tzashinorpu.FirstRound.Chapter08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_2_051 {
    private List<List<String>> res = new ArrayList<>();
    private List<List<Integer>> intsRes = new ArrayList<>();
    Set cols = new HashSet();
    Set pies = new HashSet();
    Set nas = new HashSet();
    private List<Integer> colIndexPerRow = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        if (n < 1) {
            return res;
        }
        dfs(n, 0, colIndexPerRow);

        return _generate_res(n);
    }

    private List<List<String>> _generate_res(int n) {
        return null;
    }

    private void dfs(int n, int row, List<Integer> colIndexPerRow) {
        if (n == row) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < colIndexPerRow.size(); i++) {
                tmp.add(colIndexPerRow.get(i));
            }
            intsRes.add(tmp);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (this.cols.contains(col) || this.pies.contains(row - col) || this.nas.contains(row + col)) {
                continue;
            }
            this.cols.add(col);
            this.pies.add(row - col);
            this.nas.add(row + col);
            colIndexPerRow.add(col);
            dfs(n, row + 1, colIndexPerRow);

            this.cols.remove(col);
            this.pies.remove(row - col);
            this.nas.remove(row + col);
            colIndexPerRow.remove(new Integer(col));
        }
    }

    public static void main(String[] args) {
        final LeetCode_2_051 test = new LeetCode_2_051();
        test.solveNQueens(4);
        for (int i = 0; i < test.intsRes.size(); i++) {
            System.out.println(test.intsRes.get(i));
        }
    }
}
