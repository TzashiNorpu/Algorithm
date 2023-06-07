//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

int Solution::minCostToMoveChips(vector<int> &position) {
  int count[2] = {0, 0};
  for (auto p: position) count[p % 2]++;
  return min(count[0], count[1]);
}