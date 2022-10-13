//
// Created by TzashiNorpu on 7/21/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int minCost_1578::minCost(string colors, vector<int> &neededTime) {
  // 区间最大值
  int res = 0;
  for (int i = 1; i < colors.length();) {
    int m = neededTime[i - 1];
    while (colors[i] == colors[i - 1]) {
      res += min(m, neededTime[i]);
      m = max(m, neededTime[i]);
      i++;
    }
    i++;
  }
  return res;
}
