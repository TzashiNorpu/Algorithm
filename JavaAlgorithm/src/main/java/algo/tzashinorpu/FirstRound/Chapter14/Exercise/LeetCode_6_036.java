package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

public class LeetCode_6_036 {
    public boolean isValidSudokuLoop1(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (validNumber(board[i][j])) {
                    if (checkRowDup(i, j, board) || checkColDup(i, j, board) || checkBoxDup(i, j, board)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean validNumber(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean checkBoxDup(int i, int j, char[][] board) {
        // (7,5)-> l_row:6 r_row:8  l_col:3 r_col:5
        int l_row = (i / 3) * 3;
        int r_row = (i / 3 + 1) * 3;
        int l_col = (j / 3) * 3;
        int r_col = (j / 3 + 1) * 3;
        for (int k = l_row; k < r_row; k++) {
            for (int l = l_col; l < r_col; l++) {
                if (i != k && j != l && board[i][j] == board[k][l]) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean checkColDup(int i, int j, char[][] board) {
        for (int k = 0; k < board.length; k++) {
            if (k != j && board[i][j] == board[i][k]) {
                return true;
            }
        }
        return false;
    }

    private boolean checkRowDup(int i, int j, char[][] board) {
        for (int k = 0; k < board[i].length; k++) {
            if (k != i && board[k][j] == board[i][j]) {
                return true;
            }
        }
        return false;
    }


    public boolean isValidSudokuLoop2(char[][] board) {
        int[][] rowCount = new int[9][9];
        int[][] colCount = new int[9][9];
        int[][][] boxCount = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int index = board[i][j] - '0' - 1;
                    rowCount[i][index]++;
                    colCount[j][index]++;
                    boxCount[i / 3][j / 3][index]++;
                    if (rowCount[i][index] > 1 || colCount[j][index] > 1 || boxCount[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
