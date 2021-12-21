package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

public class LeetCode_6_130_1 {
    private class UnionFind {
        private int[] parent;

        private UnionFind(char[][] board) {
            int rows = board.length;
            int cols = board[0].length;
            this.parent = new int[rows * cols + 1];
            // 用来连接边上 0 点的点
            this.parent[rows * cols] = rows * cols;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    /*if ((i == 0 || j == 0 || i == rows - 1 || j == cols - 1) && board[i][j] == 'O') {
                        this.parent[i * cols + j] = -1;
                    } else {*/
                    if (board[i][j] == 'O') {
                        this.parent[i * cols + j] = i * cols + j;
                        // 边界上上 0 和 dummyNode union
                        if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                            union(i * cols + j, rows * cols);
                        }
                    }
                }
            }
        }

        private int find(int i) {
            if (i == -1 || parent[i] == i) {
                return i;
            }
            return parent[i] = find(parent[i]);
        }

        // dummyNode 是大树， union 是往大数上合并
        public void union(int i1, int i2) {
            int p1 = find(i1);
            int p2 = find(i2);
            if (p1 == p2) {
                return;
            }
            if (p1 > p2) {
                parent[p2] = p1;
            } else {
                parent[p1] = p2;
            }
        }
    }

    public void solve(char[][] board) {
        UnionFind uf = new UnionFind(board);
        int rows = board.length;
        int cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int i1 = i * cols + j;
                if (board[i][j] == 'O') {
                    // 向右
                    if (j + 1 < cols && board[i][j + 1] == 'O') {
                        uf.union(i1, i * cols + j + 1);
                    }
                    // 向下
                    if (i + 1 < rows && board[i + 1][j] == 'O') {
                        uf.union(i1, (i + 1) * cols + j);
                    }
                }
            }
        }
        int cnt = 0;
        for (int i = rows * cols; i >= 0; i--) {
            if (uf.parent[i] != 0) {
                // 连接内部 O 元素至 dummyNode
                if (uf.parent[i] != uf.parent[uf.parent[i]]) {
                    uf.parent[i] = uf.parent[uf.parent[i]];
                }
                // 统计 O 的个数
                cnt++;
            }
        }
        //
        if (cnt != rows * cols + 1) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (uf.parent[i * cols + j] != 0 && uf.parent[i * cols + j] != rows * cols) {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }
}
