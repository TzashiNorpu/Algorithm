//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

vector <vector<int>> Solution::spiralMatrix(int m, int n, ListNode *head) {
  vector <vector<int>> dirs = {{0,  1},
                               {1,  0},
                               {0,  -1},
                               {-1, 0}};
  vector <vector<int>> res(m, vector<int>(n, -1));
  for (int i = 0, x = 0, y = 0, d = 0; i < m * n; i++) {
    if (head) {
      res[x][y] = head->val;
      head = head->next;
    } else {
      res[x][y] = -1;
    }
    int nx = x + dirs[d][0];
    int ny = y + dirs[d][1];
    // 遍历完当前方向后改变方向
    if (nx < 0 || nx >= m || ny < 0 || ny >= n || res[nx][ny] != -1) {
      d = (d + 1) % 4;
      nx = x + dirs[d][0];
      ny = y + dirs[d][1];
    }
    x = nx;
    y = ny;
  }
  return res;
}