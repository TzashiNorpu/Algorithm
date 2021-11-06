package algo.tzashinorpu.SecondRound.Chapter09;

public class updateBoard_529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
        dfs(x, y, dx, dy, board);
        return board;
    }

    private void dfs(int x, int y, int[] dx, int[] dy, char[][] board) {
        if (Invalid(x, y, board)) {
            return;
        }
        if (board[x][y] != 'E') {
            return;
        }
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            if (!Invalid(x + dx[i], y + dy[i], board) && board[x + dx[i]][y + dy[i]] == 'M') {
                cnt++;
            }
        }
        if (cnt > 0) {
            board[x][y] = (char) (cnt + '0');
            return;
        }
        board[x][y] = 'B';
        for (int i = 0; i < 8; i++) {
            dfs(x + dx[i], y + dy[i], dx, dy, board);
        }
    }

    private boolean Invalid(int x, int y, char[][] board) {
        return x < 0 || x >= board.length || y < 0 || y >= board[0].length;
    }
}
