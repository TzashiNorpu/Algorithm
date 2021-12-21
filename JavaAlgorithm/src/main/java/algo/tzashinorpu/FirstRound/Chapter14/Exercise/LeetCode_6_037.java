package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

public class LeetCode_6_037 {
    public void solveSudoku(char[][] board) {
        int[][] rowCount = new int[9][9];
        int[][] colCount = new int[9][9];
        int[][][] boxCount = new int[3][3][9];
        int[][][] boxRemain = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                boxRemain[i / 3][j / 3][(i % 3) * 3 + j % 3]++;
                char c = board[i][j];
                int index = c - '0' - 1;

                if (c != '.') {
                    rowCount[i][index]++;
                    colCount[j][index]++;
                    boxCount[i / 3][j / 3][index]++;
                    boxRemain[i / 3][j / 3][index]--;
                }
            }
        }
        dfs1(0, 0, rowCount, colCount, boxCount, boxRemain, board);
//        dfs2(0, rowCount, colCount, boxCount, boxRemain, board);
    }

    private void dfs1(int x, int y, int[][] rowCount, int[][] colCount, int[][][] boxCount, int[][][] boxRemain, char[][] board) {
        if (x == 9 || y == 9) {
            return;
        }
        char c = board[x][y];
        if (c != '.') {
            int index = c - '0' - 1;
            if (rowCount[x][index] > 1 || colCount[y][index] > 1 || boxCount[x / 3][y / 3][index] > 1) {
                return;
            }
        }

        for (int i = x; i < 9; i++) {
//            for (int j = y; j < 9; j++) {
            if (board[i][y] == '.') {
                for (int k = 0; k < boxRemain[i / 3][y / 3].length; k++) {
                    if (boxRemain[i / 3][y / 3][k] == 1) {
                        boxRemain[i / 3][y / 3][k]--;
                        rowCount[i][k]++;
                        colCount[y][k]++;
                        boxCount[i / 3][y / 3][k]++;
                        board[i][y] = Character.forDigit(k + 1, 10);
                        dfs1(i, y + 1, rowCount, colCount, boxCount, boxRemain, board);
                        board[i][y] = '.';
                        boxCount[i / 3][y / 3][k]--;
                        colCount[y][k]--;
                        rowCount[i][k]--;
                        boxRemain[i / 3][y / 3][k]++;
                    }
                }
            } else {
                dfs1(i, y + 1, rowCount, colCount, boxCount, boxRemain, board);
            }
        }
    }
}
