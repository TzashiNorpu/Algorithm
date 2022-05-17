package algo.tzashinorpu.SpecialSubject.Top;

public class isValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
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
                    if (rowCount[i][index] > 1 || colCount[j][index] > 1 || boxCount[i / 3][j / 3][index] > 1)
                        return false;
                }
            }
        }
        return true;
    }
}
