//
// Created by TzashiNorpu on 10/13/2022.
//
#include "../header/1800_1900.h"

using namespace ZeroTrac;

vector<int> Solution::getBiggestThree(vector<vector<int>> &grid) {
  set<int> s;
  for (int i = 0; i < grid.size(); ++i)
    for (int j = 0; j < grid[0].size(); ++j)
      // 当前元素为菱形左点 i+sz: 下边界 i-sz：上边界  j+2*sz：右边界
      for (int sz = 0; i + sz < grid.size() && i - sz >= 0 && j + 2 * sz < grid[0].size(); ++sz) {
        int x = i, y = j, r_sum = 0;
        // 走到菱形下边顶点
        do r_sum += grid[x++][y++]; while (x < i + sz);
        if (sz > 0) {
          // 走到菱形右边顶点
          do r_sum += grid[x--][y++]; while (y < j + 2 * sz);
          // 走到菱形上边顶点
          do r_sum += grid[x--][y--]; while (x > i - sz);
          // 走回菱形原顶点
          do r_sum += grid[x++][y--]; while (x < i);
        }
        s.insert(r_sum);
        if (s.size() > 3)
          s.erase(begin(s));
      }
  return vector<int>(rbegin(s), rend(s));
}