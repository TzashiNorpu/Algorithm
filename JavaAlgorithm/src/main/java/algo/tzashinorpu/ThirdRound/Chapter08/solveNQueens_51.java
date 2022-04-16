package algo.tzashinorpu.ThirdRound.Chapter08;

import java.util.ArrayList;
import java.util.List;

public class solveNQueens_51 {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allSol = new ArrayList<>();
        boolean[] pie = new boolean[2 * n];
        boolean[] na = new boolean[2 * n];
        boolean[] cols = new boolean[n];
        int level = 0;
        char[][] sol = new char[n][n];
        backTrack(n, level, pie, na, cols, sol, allSol);
        return allSol;
    }

    private void backTrack(int n, int level, boolean[] pie, boolean[] na, boolean[] cols, char[][] sol, List<List<String>> allSol) {
        if (level == n) {
            ArrayList<String> tmp = new ArrayList<>();
            for (int i = 0; i < sol.length; i++) {
                for (int j = 0; j < sol[i].length; j++) {
                    if (sol[i][j] != 'Q') sol[i][j] = '.';
                }
                String x = new String(sol[i]);
//                System.out.println(x);
                tmp.add(x);
            }
            allSol.add(tmp);
//            System.out.println("-----------------------");
            return;
        }
        for (int i = 0; i < n; i++) {
            if (pie[level + i] || na[i - level + n] || cols[i]) continue;
            // 捺 相减为常数
            // 撇 相加为常数
            na[i - level + n] = true;
            pie[level + i] = true;
            cols[i] = true;
            sol[level][i] = 'Q';
            backTrack(n, level + 1, pie, na, cols, sol, allSol);
            sol[level][i] = '.';
            cols[i] = false;
            pie[level + i] = false;
            na[i - level + n] = false;
        }
    }
}
