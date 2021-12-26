package algo.tzashinorpu.FirstRound.Chapter14.Exercise;

import java.util.*;

public class LeetCode_6_037 {
    public void solveSudoku(char[][] board) {
        int[][] rowCount = new int[9][9];
        int[][] colCount = new int[9][9];
        int[][][] boxCount = new int[3][3][9];
        List<Integer>[][] boxRemainNum = new ArrayList[3][3];
//        Set[][] boxRemainNum = new HashSet[3][3];
//        List<int[]>[][] boxRemainPos = new ArrayList[3][3];
        List<Integer>[][] boxRemainPos = new ArrayList[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boxRemainNum[i][j] = new ArrayList<>();
                boxRemainNum[i][j].addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//                boxRemainNum[i][j] = new HashSet(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
                boxRemainPos[i][j] = new ArrayList<>();
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // 8,0 -> 6
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    rowCount[i][index]++;
                    colCount[j][index]++;
                    boxCount[i / 3][j / 3][index]++;
                    boxRemainNum[i / 3][j / 3].remove((Integer) (index + 1));
//                    boxRemainNum[i / 3][j / 3].remove(index + 1);
                } else {
//                    boxRemainPos[i / 3][j / 3].add(new int[]{i, j});
                    boxRemainPos[i / 3][j / 3].add(i * 9 + j);
                }
            }
        }
        dfs(boxRemainPos, boxRemainNum, rowCount, colCount, boxCount, board);
    }

    private boolean dfs(List<Integer>[][] boxRemainPos, List<Integer>[][] boxRemainNum, int[][] rowCount, int[][] colCount, int[][][] boxCount, char[][] board) {
        if (InvalidSudoku(board, rowCount, colCount, boxCount)) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int size1 = boxRemainPos[i][j].size();
                for (int m = 0; m < size1; m++) {
                    int pos = boxRemainPos[i][j].get(m);
                    int x = pos / 9;
                    int y = pos % 9;
                    int size2 = boxRemainNum[i][j].size();
                    for (int l = 0; l < size2; l++) {
                        int v = boxRemainNum[i][j].get(l);
//                        boxRemainNum[i][j].remove((Integer) v);
                        boxRemainPos[i][j].remove((Integer) (x * 9 + y));
                        rowCount[x][v - 1]++;
                        colCount[y][v - 1]++;
                        boxCount[i][j][v - 1]++;
                        board[x][y] = Character.forDigit(v, 10);
                        if (dfs(boxRemainPos, boxRemainNum, rowCount, colCount, boxCount, board)) {
                            return true;
                        }
                        board[x][y] = '.';
                        boxCount[i][j][v - 1]--;
                        colCount[y][v - 1]--;
                        rowCount[x][v - 1]--;
                        boxRemainPos[i][j].add(x * 9 + y);
//                        boxRemainNum[i][j].add(v);
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private boolean InvalidSudoku(char[][] board, int[][] rowCount, int[][] colCount, int[][][] boxCount) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    if (rowCount[i][index] > 1 || colCount[j][index] > 1 || boxCount[i / 3][j / 3][index] > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
