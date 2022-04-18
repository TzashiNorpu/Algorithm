package algo.tzashinorpu.ThirdRound.Chapter09;

public class updateBoard_529 {
    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return board;
        }
        int[][] dirs = {{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        _dfs(x, y, dirs, board);
        return board;
    }

    private void _dfs(int x, int y, int[][] dirs, char[][] board) {
        if (inValid(x, y, board)) {
            return;
        }
        if (board[x][y] != 'E') {
            return;
        }
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            if (!inValid(x + dirs[i][0], y + dirs[i][1], board) && board[x + dirs[i][0]][y + dirs[i][1]] == 'M') cnt++;
        }
        if (cnt > 0) {
            board[x][y] = (char) (cnt + '0');
            return;
        }
        board[x][y] = 'B';
        for (int i = 0; i < 8; i++) {
            _dfs(x + dirs[i][0], y + dirs[i][1], dirs, board);
        }
    }

    private boolean inValid(int x, int y, char[][] board) {
        return x < 0 || x >= board.length || y < 0 || y >= board[0].length;
    }
}
