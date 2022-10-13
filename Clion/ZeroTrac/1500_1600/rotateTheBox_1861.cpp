//
// Created by TzashiNorpu on 7/12/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

vector<vector<char>> rotateTheBox_1861::rotateTheBox(vector<vector<char>> &box) {
  int m = box.size(), n = box[0].size();
  vector<vector<char>> res(n, vector<char>(m, '.'));
  for (int i = 0; i < m; ++i)
    for (int j = n - 1, k = n - 1; j >= 0; --j)
      if (box[i][j] != '.') {
        // 记住离当前最近的*的列数
        k = box[i][j] == '*' ? j : k;
        res[k--][m - i - 1] = box[i][j];
      }
  return res;
}
