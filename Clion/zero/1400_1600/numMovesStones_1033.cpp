//
// Created by TzashiNorpu on 2023/6/12.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::numMovesStones(int a, int b, int c) {
  vector<int> v = {a, b, c};
  std::sort(v.begin(), v.end());
  if (v[2] - v[0] == 2) return {0, 0};
  return {min(v[1] - v[0], v[2] - v[1]) <= 2 ? 1 : 2, v[2] - v[0] - 2};
}