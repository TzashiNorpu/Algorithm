package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

public class LeetCode_6_200 {
    // https://leetcode-cn.com/problems/number-of-islands/
    // 岛屿数量  并查集
    // 如果当前是“陆地”，尝试与周围合并一下  如果当前是“水域”，就把所有的“水域”合并在一起  设置了一个虚拟的结点，表示“所有的水域都和这个虚拟结点是连接的”


    class UnionFind {
        private int count = 0; // 集合的个数
        private int[] parent, rank;

        // 初始化 : 每一个元素拥有一个parent数组指向自己 表示自己就是自己的集合
        public UnionFind(char[][] grid) {
            count = 0;
            int m = grid.length;
            int n = grid[0].length;
            parent = new int[m * n];
            rank = new int[m * n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (grid[i][j] == '1') {
                        // x 坐标 * 列数 + 列坐标  --> 二位矩阵的坐标转换为一维的
                        // n = 5
                        // [0,0]-->parent[0]-->0
                        // [0,1]-->parent[1]-->1
                        // [1,2]-->parent[7]-->7
                        parent[i * n + j] = i * n + j; //
                        ++count;
                    }
                    // 加权
                    rank[i * n + j] = 0;
                }
            }
        }


        // 返回boss元素
        public int find(int p) {
            while (p != parent[p]) {
                // 爷爷节点给到当前节点
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            parent[rootQ] = rootP;
//            if (rank[rootQ] > rank[rootP]) {
//                parent[rootP] = rootQ;
//            } else {
//                parent[rootQ] = rootP;
//                if (rank[rootP] == rank[rootQ]) {
//                    rank[rootP]++;
//                }
//            }
            count--;
        }

        public int count() {
            return count;
        }
    }

    public int numIslands(char[][] M) {
        if (M == null || M.length == 0) {
            return 0;
        }
        int n = M.length;
        int m = M[0].length;
        UnionFind uf = new UnionFind(M);
        for (int i = 0; i < n; i++) {
            // 剔除最后一列
            for (int j = 0; j < m; j++) {
                int index1 = i * m + j;
                if (M[i][j] == '1') {
                    // 向右
                    if ((j + 1) < m && M[i][j + 1] == '1') {
                        // 方便debug
                        int index2 = i * m + j + 1;
                        uf.union(index1, index2);
                    }
                    // 向下
                    if ((i + 1) < n && M[i + 1][j] == '1') {
                        int index2 = (i + 1) * m + j;
                        uf.union(index1, index2);
                    }
                }
            }
        }
        return uf.count();
    }

    public static void main(String[] args) {
        char[][] islands = {
                //{'1'},{'1'}
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'},
                {'0', '0', '1', '1', '1'}
        };
        LeetCode_6_200 test = new LeetCode_6_200();
        System.out.println(test.numIslands(islands));
    }
}

