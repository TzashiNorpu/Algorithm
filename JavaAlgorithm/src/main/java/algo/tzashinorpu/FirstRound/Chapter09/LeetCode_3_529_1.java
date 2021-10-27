package algo.tzashinorpu.FirstRound.Chapter09;

public class LeetCode_3_529_1 {
    public char[][] updateBoard(char[][] board, int[] click) {
        // 'M' -> unknown mine  'X' -> known mine 'E' -> unknown empty 'B' -> 米 empty
        int[] dirR = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dirC = {-1, 0, 1, -1, 1, -1, 0, 1};
        int r = click[0];
        int c = click[1];
        if (board[r][c] == 'M') {
            board[r][c] = 'X';
        } else {
            dfs(board, r, dirR, c, dirC);
        }
        return board;
    }

    private void dfs(char[][] board, int r, int[] dirR, int c, int[] dirC) {
        if (invalidPos(r, c, board)) {
            return;
        }
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int x = r + dirR[i];
            int y = c + dirC[i];
            if (invalidPos(x, y, board)) {
                continue;
            }
            if (board[x][y] == 'M') {
                cnt++;
            }
        }
        if (cnt > 0) {
            board[r][c] = (char) (cnt + '0');
        } else {
            // B 才扩散
            board[r][c] = 'B';
            for (int i = 0; i < 8; i++) {
                int x = r + dirR[i];
                int y = c + dirC[i];
                // 只走未走过的地方
                if (invalidPos(x, y, board) || board[x][y] != 'E') {
                    continue;
                }
                dfs(board, x, dirR, y, dirC);
            }
        }
    }

    private boolean invalidPos(int r, int c, char[][] board) {
        return r < 0 || r >= board.length || c < 0 || c >= board[0].length;
    }
}
