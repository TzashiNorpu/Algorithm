package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class exist_79 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(i, j, board, word.toCharArray(), 0, dirs, visited)) return true;
            }
        }
        return false;
    }

    private boolean dfs(int row, int col, char[][] board, char[] word, int i, int[][] dirs, boolean[][] visited) {
        if (i == word.length) return true;
        if (invalid(row, col, board)) return false;
        if (visited[row][col]) return false;
        if (word[i] != board[row][col]) return false;
        visited[row][col] = true;
        boolean find = false;
        for (var dir : dirs) {
            find = find || dfs(row + dir[0], col + dir[1], board, word, i + 1, dirs, visited);
        }
        visited[row][col] = false;
        return find;
    }

    private boolean invalid(int row, int col, char[][] board) {
        return row < 0 || row >= board.length || col < 0 || col >= board[0].length;
    }
}
