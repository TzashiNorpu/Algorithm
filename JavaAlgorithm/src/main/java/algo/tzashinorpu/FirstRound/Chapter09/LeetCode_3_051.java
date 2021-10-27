package algo.tzashinorpu.FirstRound.Chapter09;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_3_051 {
    private boolean[] placedCol;
    // row - col -> fixed 有小于 0 的， row - col + n - 1
    private boolean[] placedPie;
    // row + col -> fixed
    private boolean[] placedNa;
    private List<List<String>> res = new ArrayList<>();
    private char[][] chess;

    public List<List<String>> solveNQueens(int n) {
        chess = new char[n][n];
        placedCol = new boolean[n];
        placedPie = new boolean[2 * n - 1];
        placedNa = new boolean[2 * n - 1];
        backTrack(res, 0, n);
        return res;
    }

    private void backTrack(List<List<String>> res, int row, int n) {
        if (row == n) {
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i < chess.length; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < chess[i].length; j++) {
                    if (chess[i][j] == 0) {
                        chess[i][j] = '.';
                    }
                    stringBuilder.append(chess[i][j]);
                }
                temp.add(stringBuilder.toString());
            }
            res.add(temp);
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!placedCol[col] && !placedPie[row - col + n - 1] && !placedNa[row + col]) {
                placedCol[col] = true;
                placedPie[row - col + n - 1] = true;
                placedNa[row + col] = true;
                chess[row][col] = 'X';
                backTrack(res, row + 1, n);
                placedCol[col] = false;
                placedPie[row - col + n - 1] = false;
                placedNa[row + col] = false;
                chess[row][col] = '.';
            }
        }
    }
}
