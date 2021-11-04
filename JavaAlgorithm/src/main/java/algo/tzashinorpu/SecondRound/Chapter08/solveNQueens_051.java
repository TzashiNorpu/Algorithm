package algo.tzashinorpu.SecondRound.Chapter08;

import java.util.LinkedList;
import java.util.List;

public class solveNQueens_051 {
    public List<List<String>> solveNQueens(int n) {
        char[][] boards = new char[n][n];
        boolean[] pie = new boolean[2 * n - 1];
        boolean[] na = new boolean[2 * n - 1];
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[n];
        List<List<String>> res = new LinkedList<>();
        backtrack(0, rows, cols, n, pie, na, boards, res);
        return res;
    }

    private void backtrack(int row, boolean[] rows, boolean[] cols, int depth, boolean[] pie, boolean[] na, char[][] boards, List<List<String>> res) {
        if (row == depth) {
//            System.out.println(Arrays.deepToString(boards));
            LinkedList<String> temp = new LinkedList<>();
            for (int i = 0; i < depth; i++) {
                StringBuilder builder = new StringBuilder();
                for (int j = 0; j < boards[0].length; j++) {
                    builder.append(boards[i][j] == 0 ? 'x' : boards[i][j]);
                }
                temp.add(builder.toString());
            }
            res.add(temp);
            return;
        }
        for (int col = 0; col < depth; col++) {
            if (!na[col - row + depth - 1] && !pie[col + row]
                    && !rows[row] && !cols[col]) {
                na[col - row + depth - 1] = true;
                pie[col + row] = true;
                rows[row] = true;
                cols[col] = true;
                boards[row][col] = 'Q';
                backtrack(row + 1, rows, cols, depth, pie, na, boards, res);
                boards[row][col] = 'x';
                rows[row] = false;
                cols[col] = false;
                na[col - row + depth - 1] = false;
                pie[col + row] = false;

            }
        }
    }
}
