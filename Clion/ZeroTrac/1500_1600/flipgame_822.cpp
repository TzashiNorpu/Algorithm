//
// Created by TzashiNorpu on 7/25/2022.
//
#include "../header/1500_1600.h"

using namespace ZeroTrac;

int flipgame_822::flipgame(vector<int> &fronts, vector<int> &backs) {
  unordered_set<int> set;
  for (int i = 0; i < fronts.size(); ++i)
    if (fronts[i] == backs[i]) set.insert(fronts[i]);
  int res = 2500;
  for (int i = 0; i < fronts.size(); ++i) {
    int f = fronts[i];
    int b = backs[i];
    if (set.count(f) == 0)
      res = min(res, f);
    if (set.count(b) == 0)
      res = min(res, b);
  }
  return res % 2500;
}
