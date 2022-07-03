package algo.tzashinorpu.WeekContest.D220703;

import algo.tzashinorpu.SpecialSubject.ListNode;

public class spiralMatrix_6111 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int pos = 0;
        for (int i = 0, x = 0, y = 0; i < m * n; i++) {
            if (head != null) {
                int val = head.val;
                matrix[x][y] = val;
                head = head.next;
            } else {
                matrix[x][y] = -1;
            }
            visited[x][y] = true;
            int nx = x + dirs[pos][0];
            int ny = y + dirs[pos][1];
            if (nx < 0 || nx == m || ny < 0 || ny == n || visited[nx][ny]) {
                pos = (pos + 1) % 4;
                nx = x + dirs[pos][0];
                ny = y + dirs[pos][1];
            }
            x = nx;
            y = ny;
        }
        return matrix;
    }
}
