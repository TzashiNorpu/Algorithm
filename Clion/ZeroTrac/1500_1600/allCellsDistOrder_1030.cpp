//
// Created by TzashiNorpu on 7/22/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

vector<vector<int>> allCellsDistOrder_1030::allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
  vector<vector<int>> ans;
  for (int i = 0; i < rows; i++)
    for (int j = 0; j < cols; j++)
      ans.push_back({i, j, abs(i - rCenter) + abs(j - cCenter)});

  sort(ans.begin(), ans.end(), [](vector<int> &c1, vector<int> &c2) {
      return c1[2] < c2[2];
  });

  for (vector<int> &d: ans)
    d.pop_back();

  return ans;
}
