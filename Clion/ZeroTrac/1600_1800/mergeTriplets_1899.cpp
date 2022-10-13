//
// Created by TzashiNorpu on 8/11/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

bool Solution::mergeTriplets(vector<vector<int>> &triplets, vector<int> &target) {
  vector<int> res(3);
  for (auto &t: triplets)
    if (t[0] <= target[0] && t[1] <= target[1] && t[2] <= target[2])
      res = {max(res[0], t[0]), max(res[1], t[1]), max(res[2], t[2])};
  return res == target;
}