package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

public class LeetCode_6_200_1 {
    private class UnionFind {
        // 岛屿数量
        private int cnt = 0;
        private int[] parent;

        public UnionFind(char[][] grid) {
            int rows = grid.length;
            int cols = grid[0].length;
            this.parent = new int[rows * cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (grid[i][j] == '1') {
                        // [["1"],["1"]] -> i * rows + j 会报错
                        this.parent[i * cols + j] = i * cols + j;
                        this.cnt++;
                    }
                }
            }
        }

        // 返回 i1 的根节点
        private int find(int i1) {
            /*while (i1 != parent[i1]) {
                find(parent[i1]);
            }
            return i1;*/
            // 两种方式
            if (i1 == parent[i1]) {
                return i1;
            }
            return parent[i1] = find(parent[i1]);
        }

        // 合并 i1 和 i2，返回合并后的根节点
        void union(int i1, int i2) {
            int p1 = find(i1);
            int p2 = find(i2);
            if (p1 == p2) {
                return;
            }
            parent[p2] = p1;
            this.cnt--;
        }

        public int getCnt() {
            return this.cnt;
        }
    }

    public int numIslands(char[][] grid) {
        UnionFind ins = new UnionFind(grid);
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int i1 = i * cols + j;
                if (grid[i][j] == '1') {
                    // 向右合并
                    // int i2 = i * rows + j + 1;
                    if (j + 1 < cols && grid[i][j + 1] == '1') {
                        ins.union(i1, i * cols + j + 1);
                    }
                    // 向下合并
                    if (i + 1 < rows && grid[i + 1][j] == '1') {
                        ins.union(i1, (i + 1) * cols + j);
                    }
                }
            }
        }
        return ins.getCnt();
    }
}