package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

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
            parent = new int[m * n + 1];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (grid[i][j] == 'O') {
                        parent[i * n + j] = i * n + j; //
                        ++count;
                    }
                }
            }
            // dummyNode
            parent[m * n] = m * n;
        }


        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            parent[rootP] = rootQ;
            count--;
        }

        public int count() {
            return count;
        }
    }

    public UnionFind solve(char[][] M) {
        if (M == null || M.length == 0) {
            return null;
        }
        int n = M.length;
        int m = M[0].length;
        int dummyNode = n * m;
        UnionFind uf = new UnionFind(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] == 'O') {
                    int index1 = i * m + j;
                    if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                        uf.union(index1, dummyNode);
                    }
                    // 向右
                    if ((j + 1) < m && M[i][j + 1] == 'O') {
                        // 方便debug
                        int index2 = i * m + j + 1;
                        uf.union(index1, index2);
                    }
                    // 向下
                    if ((i + 1) < n && M[i + 1][j] == 'O') {
                        int index2 = (i + 1) * m + j;
                        uf.union(index1, index2);
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!uf.isConnected(i * m + j, dummyNode)) {
                    M[i][j] = 'X';
                }
            }
        }
        return uf;
    }


    public static void main(String[] args) {
        char[][] area = {
                {'X', 'O', 'O', 'X', 'X', 'X', 'O', 'X', 'O', 'O'},
                {'X', 'O', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'O', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X', 'X', 'O', 'X', 'X', 'X', 'O'},
                {'O', 'X', 'X', 'X', 'O', 'X', 'O', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X', 'X', 'O', 'O', 'X', 'X', 'X'},
                {'O', 'X', 'X', 'O', 'O', 'X', 'O', 'X', 'X', 'O'},
                {'O', 'X', 'X', 'X', 'X', 'X', 'O', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X', 'X', 'O', 'X', 'X', 'O', 'O'},
                {'X', 'X', 'X', 'O', 'O', 'X', 'O', 'X', 'X', 'O'}
        };
        LeetCode_6_130 test = new LeetCode_6_130();
        UnionFind unionFind = test.solve(area);
        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area[0].length; j++) {
                System.out.printf("%c\t", area[i][j]);
            }
            System.out.println();
        }
    }
}
