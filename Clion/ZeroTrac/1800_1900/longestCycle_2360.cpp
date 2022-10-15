//
// Created by TzashiNorpu on 10/13/2022.
//
#include "1800_1900.h"

using namespace ZeroTrac;

int Solution::longestCycle(vector<int> &edges) {
  int res = -1;
  int n = edges.size();
  vector<pair<int, int>> memo(n, {-1, -1});
  // memo 索引位置到 pair[1] 位置的距离为 pair[0]
  for (int i = 0; i < n; ++i) {
    for (int j = i, dist = 0; j != -1; j = edges[j]) {
      auto [dist_i, from_i] = memo[j];
      // dist++ : 有环时用此距离计算环的大小
      if (dist_i == -1) memo[j] = {dist++, i};
      else {
        // dist_i：0 -> 3 的距离【没有经过环】
        // dist: 0-> 3 的距离【经过环后】
        // from_i == i：这个环是这次遍历的环
        if (from_i == i)
          res = max(res, dist - dist_i);
        break;
      }
    }
  }
  return res;
}