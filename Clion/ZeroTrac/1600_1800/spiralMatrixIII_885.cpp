//
// Created by TzashiNorpu on 9/30/2022.
//

#include "header.h"

using namespace ZeroTrac;

vector<vector<int>> Solution::spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
  vector<vector<int>> res = {{rStart, cStart}};
  int r = 0, c = 1, tmp;
  for (int n = 0; res.size() < rows * cols; ++n) {
    for (int i = 0; i < n / 2 + 1; ++i) {
      rStart += r, cStart += c;
      if (0 <= rStart && rStart < rows && 0 <= cStart && cStart < cols) res.push_back({rStart, cStart});
    }
    // (r,c) -> (c,-r)
    /*
     * 0,1 -> 1,0 -> 0,-1 -> -1,0 -> 0,1
     */
    tmp = r, r = c, c = -tmp;
  }
  return res;
}