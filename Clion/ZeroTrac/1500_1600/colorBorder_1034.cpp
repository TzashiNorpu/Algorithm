//
// Created by TzashiNorpu on 7/21/2022.
//
#include "header.h"

using namespace ZeroTrac;

void dfs(vector<vector<int>> &grid, vector<vector<int>> &dup, int r, int c, int color, int color1) {
    // 递归时进行修改会导致进不到邻近节点，所以要用备份
    if (r < 0 || r >= grid.size() || c < 0 || c >= grid[0].size() || grid[r][c] != color)
        return;

    grid[r][c] = INT_MAX;
    if (r == 0 || r == grid.size() - 1 || c == 0 || c == grid[0].size() - 1) dup[r][c] = color1;

    dfs(grid, dup, r + 1, c, color, color1);
    if (r + 1 < grid.size() && grid[r][c] != grid[r + 1][c]) dup[r][c] = color1;
    dfs(grid, dup, r - 1, c, color, color1);
    if (r - 1 >= 0 && grid[r][c] != grid[r - 1][c]) dup[r][c] = color1;
    dfs(grid, dup, r, c + 1, color, color1);
    if (c + 1 < grid[0].size() && grid[r][c] != grid[r][c + 1]) dup[r][c] = color1;
    dfs(grid, dup, r, c - 1, color, color1);
    if (c - 1 >= 0 && grid[r][c] != grid[r][c - 1]) dup[r][c] = color1;
}

vector<vector<int>> colorBorder_1034::colorBorder(vector<vector<int>> &grid, int row, int col, int color) {
    int rows, cols;

    if ((rows = grid.size()) == 0 || (cols = grid[0].size()) == 0)
        return {};

    vector<vector<int>> temp(grid);
    dfs(grid, temp, row, col, grid[row][col], color);

    /*for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                if (temp[i][j] == INT_MAX)
                    grid[i][j] = color;
            } else {
                if ((temp[i][j]) == INT_MAX and
                    ((temp[i - 1][j] != INT_MAX) || (temp[i + 1][j] != INT_MAX) ||
                     (temp[i][j - 1] != INT_MAX) || (temp[i][j + 1] != INT_MAX)))
                    grid[i][j] = color;
            }
        }
    }*/
    return temp;
}