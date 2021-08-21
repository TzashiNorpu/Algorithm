package algo.tzashinorpu.test;

public class LT695 {
    static int test = 0;
    /*
    myFirst:
     public static void main(String[] args) {
            int[][] grid = {
    //                {1, 0, 1},
    //                {1, 1, 0},
                    {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                    {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
            };
            int w = grid[0].length;
            int h = grid.length;
            System.out.printf("w=%d,h=%d\n", w, h);
            int area = 0;
            int maxArea = 0;
            int[] dx = {-1, 0, 1, 0};
            int[] dy = {0, 1, 0, -1};
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
    //                System.out.println(grid[i][j]);
                    algo.tzashinorpu.test = 0;
                    traverse(i, j, dx, dy, grid);
                    maxArea = Math.max(algo.tzashinorpu.test, maxArea);
                }
            }
            System.out.println(maxArea);
        }

        static void traverse(int i, int j, int[] dx, int[] dy, int[][] grid) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
                return;
            }
            if (grid[i][j] == 0) {
                //area[i][j]=0;
                return;
            }
            if (grid[i][j] == 1) {
                algo.tzashinorpu.test++;
                grid[i][j] = 0;
            }

            for (int t = 0; t < 4; t++) {
                int x = i + dx[t];
                int y = j + dy[t];
                traverse(x, y, dx, dy, grid);
            }
        }
     */
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    int[][] g;
    int cnt;
    int maxCnt = 0;

    public void numsIslands(int[][] grid) {
        int island = 0;
        g = grid;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                if (g[i][j] == 0) continue;
                cnt = 1;
//                island += sink(i, j);
                sink(i, j);
                maxCnt = Math.max(maxCnt, cnt);

            }
        }
        System.out.println(maxCnt);
//        return island;
    }

    private void sink(int i, int j) {
        if (g[i][j] == 0) {
            return;
        }
        g[i][j] = 0;
        for (int k = 0; k < dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x >= 0 && x < g.length && y >= 0 && y < g[i].length) {
                if (g[x][y] == 0) continue;
                cnt++;
                sink(x, y);
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0},
        };
        LT695 test = new LT695();
        test.numsIslands(grid);
    }
}
