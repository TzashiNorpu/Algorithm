//
// Created by TzashiNorpu on 8/11/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::maxNumberOfFamilies(int n, vector<vector<int>> &reservedSeats) {
  unordered_map<int, int> graph;
  for (auto &r: reservedSeats) {
    int row = r[0], col = r[1];
    graph[row] |= (1 << col);
  }
  int res = 0;
  for (auto &kv: graph) {
    int reserved = kv.second;
    int cnt = 0;
    // check if seats 2,3,4,5 are available
    if ((reserved & 60) == 0) cnt++;
    // check if seats 6,7,8,9 are available
    if ((reserved & 960) == 0) cnt++;
    // check if seats 4,5,6,7 are available
    if ((reserved & 240) == 0 && cnt == 0) cnt = 1;
    res += cnt;
  }
  // 没有预留的那排最多可以做两组人
  return res + 2 * (n - graph.size());
}