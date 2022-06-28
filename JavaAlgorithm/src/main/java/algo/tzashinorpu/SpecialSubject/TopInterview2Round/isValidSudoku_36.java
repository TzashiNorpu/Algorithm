package algo.tzashinorpu.SpecialSubject.TopInterview2Round;

public class isValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (Character.isDigit(c)) {
                    rows[i][c - '0']++;
                    if (rows[i][c - '0'] > 1) return false;
                    cols[j][c - '0']++;
                    if (cols[j][c - '0'] > 1) return false;
                    boxes[(i / 3) * 3 + j / 3][c - '0']++;
                    if (boxes[(i / 3) * 3 + j / 3][c - '0'] > 1) return false;
                }
            }
        }
        return true;
    }
}
