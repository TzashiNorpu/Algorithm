package algo.tzashinorpu.FirstRound.Chapter13.HomeWork;

public class LeetCode_6_547 {
    // https://leetcode-cn.com/problems/friend-circles -- 朋友圈和岛屿问题一致  四连通
    // 并查集 Disjoint set
    // N --> 各自独立集合
    // 遍历好友关系矩阵 M: M[i][j] == 1 则 i  j 是好友,进行 i 所在集合和 j 所在集合的合并
    // 最后统计孤立的集合数
    // inner class
    class UnionFind {
        private int count = 0; // 集合的个数
        private int[] parent, rank;

        // 初始化 : 每一个元素拥有一个parent数组指向自己 表示自己就是自己的集合
        public UnionFind(int n) {
            // 初始化集合数
            count = n;
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i; //
            }
        }
        // parent[i] = i 是当前集合的boss元素
        // parent[0] = 0    parent[1] = 0  parent[2] = 1 --> 0 1 2 这三个元素组成一个集合,0是这个集合的boss元素
        //  parent[0] = 0    parent[1] = 0  parent[2] = 1 parent[3] = 2  parent[4] = 3---路径压缩---> parent[0] = 0    parent[1] = 0  parent[2] = 0 parent[3] = 0  parent[4] = 0

        // 返回boss元素
        public int find(int p) {
            while (p != parent[p]) {
                // 爷爷节点给到当前节点
                // if p = 3 then parent[parent[p]] = 1
                parent[p] = parent[parent[p]];    // path compression by halving
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            // 找到p元素所在的领头元素
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            if (rank[rootQ] > rank[rootP]) {
                parent[rootP] = rootQ;
            } else {
                parent[rootQ] = rootP;
                if (rank[rootP] == rank[rootQ]) {
                    rank[rootP]++;
                }
            }
            count--;
        }

        public int count() {
            return count;
        }
    }

    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
        }
        return uf.count();
    }

    // M[i,j] == M[j,i]  --> 对称矩阵
    // M[i,j] == 1 : i 和 j 是朋友
    public static void main(String[] args) {
        int[][] friends = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        LeetCode_6_547 test = new LeetCode_6_547();
        System.out.println(test.findCircleNum(friends));
    }
}
