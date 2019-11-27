package Week06.Chapter13;

public class LeetCode_6_130 {
    // https://leetcode-cn.com/problems/surrounded-regions/
    // 并查集
    // 任何不在边界上，或不与边界上的 'O' 相连(四连通)的 'O' 最终都会被填充为 'X'
    // 找出'O'组成的集合  在这些集合中检查是否有在边界上的'O'元素
    class UnionFind {
        private int count = 0;
        private int[] parent;

        public UnionFind(char[][] grid) {
            count = 0;
            int m = grid.length;
            int n = grid[0].length;
            parent = new int[m * n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (grid[i][j] == 'O') {
                        parent[i * n + j] = i * n + j; //
                        ++count;
                    }
                }
            }
        }


        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            parent[rootQ] = rootP;
            count--;
        }

        public int count() {
            return count;
        }
    }

    public UnionFind numIslands(char[][] M) {
        if (M == null || M.length == 0) {
            return null;
        }
        int n = M.length;
        int m = M[0].length;
        UnionFind uf = new UnionFind(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int index1 = i * m + j;
                if (M[i][j] == 'O') {
                    // 向右
                    if ((j + 1) < m && M[i][j + 1] == 'O' ) {
                        // 方便debug
                        int index2 = i * m + j + 1;
                        uf.union(index1, index2);
                    }
                    // 向下
                    if ((i + 1) < n && M[i + 1][j] == 'O' ) {
                        int index2 = (i + 1) * m + j;
                        uf.union(index1, index2);
                    }

                }
            }
        }
        return uf;
    }


    public static void main(String[] args) {
        char[][] area = {
                {'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'O', 'X', 'X'},
                {'X', 'X', 'O', 'X'},
        };
        LeetCode_6_130 test = new LeetCode_6_130();
        UnionFind unionFind = test.numIslands(area);
        System.out.println("xxx");
    }
}
