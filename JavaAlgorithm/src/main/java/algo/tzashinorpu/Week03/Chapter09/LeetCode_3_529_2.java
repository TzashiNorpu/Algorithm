package algo.tzashinorpu.Week03.Chapter09;

public class LeetCode_3_529_2 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int r = click[0];
        int c = click[1];
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, -0, 1};
        if (board[r][c] == 'M') {
            board[r][c] = 'X';
            return board;
        }
        dfs(r, dr, c, dc, board);
        return board;
    }

    private void dfs(int r, int[] dr, int c, int[] dc, char[][] board) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            int x = r + dr[i];
            int y = c + dc[i];
            if (!invalidPos(x, y, board)) {
                if (board[x][y] == 'M') {
                    cnt++;
                }
            }
        }
        if (cnt > 0) {
            board[r][c] = (char) (cnt + '0');
            return;
        }
        board[r][c] = 'B';
        for (int i = 0; i < 8; i++) {
            int x = r + dr[i];
            int y = c + dc[i];
            if (!invalidPos(x, y, board) && board[x][y] == 'E') {
                dfs(x, dr, y, dc, board);
            }
        }
    }

    private boolean invalidPos(int r, int c, char[][] board) {
        return r < 0 || r >= board.length || c < 0 || c >= board[0].length;
    }
}
