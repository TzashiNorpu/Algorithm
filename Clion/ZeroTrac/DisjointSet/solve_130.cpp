//
// Created by TzashiNorpu on 10/14/2022.
//
#include "disjoint_set.h"


using namespace DS;

void Solution::solve(vector<vector<char>> &board) {
  int m = board.size(), n = board[0].size();
  UF uf = *new UF(m * n + 1);
  int dummy = m * n;
  // 将首列和末列的 O 与 dummy 连通
  for (int i = 0; i < m; ++i) {
    if (board[i][0] == 'O')
      uf.connect(i * n, dummy);
    if (board[i][n - 1] == 'O')
      uf.connect(i * n + n - 1, dummy);
  }
  // 将首行和末行的 O 与 dummy 连通
  for (int i = 0; i < n; ++i) {
    if (board[0][i] == 'O')
      uf.connect(i, dummy);
    if (board[m - 1][i] == 'O')
      uf.connect(n * (m - 1) + i, dummy);
  }
  vector<vector<int>> d = {{1,  0},
                           {0,  1},
                           {0,  -1},
                           {-1, 0}};
  for (int i = 1; i < m - 1; ++i) {
    for (int j = 1; j < n - 1; ++j) {
      if (board[i][j] == 'O')
        for (auto dir: d) {
          int x = i + dir[0];
          int y = j + dir[1];
          if (board[x][y] == 'O')
            uf.connect(x * n + y, i * n + j);
        }
    }
  }
  for (int i = 1; i < m - 1; ++i) {
    for (int j = 1; j < n - 1; ++j) {
      if (!uf.connected(dummy, i * n + j))
        board[i][j] = 'X';
    }
  }
}