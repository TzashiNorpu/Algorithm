//
// Created by TzashiNorpu on 7/25/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::countLatticePoints_2249(vector<vector<int>> &circles) {
  unordered_set<int> set;
  for (vector<int> c: circles) {
    int x = c[0], y = c[1], r = c[2];
    for (int i = -r; i <= r; ++i) {
      for (int j = -r; j <= r; ++j) {
        if (i * i + j * j <= r * r) set.insert((x + i) * 1000 + (y + j));
      }
    }
  }
  return set.size();
}