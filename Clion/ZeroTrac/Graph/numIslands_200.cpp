#include "../header/g"
using namespace G;

int Solution::numIslands(vector<vector<char>> &grid)
{

    int res = 0;
    int m = grid.size(), n = grid[0].size();
    vector<vector<int>> dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    function<void(vector<vector<char>> &, int, int)> dfs = [&](vector<vector<char>> &grid, int x, int y) -> void
    {
        if (x < 0 || x == m || y < 0 || y == n || grid[x][y] == '0')
            return;
        grid[x][y] = '0';
        for (auto dir : dirs)
            dfs(grid, x + dir[0], y + dir[1]);
    };
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            if (grid[i][j] == '1')
                res++, dfs(grid, i, j);
    return res;
}