//
// Created by TzashiNorpu on 8/12/2022.
//
#include "../header/1600_1800.h"

using namespace ZeroTrac;

int Solution::largestCombination(vector<int> &cs) {
  int res = 0, max_e = *max_element(begin(cs), end(cs));
  for (int b = 1; b <= max_e; b <<= 1) {
    int cnt = 0;
    for (auto n: cs)
      cnt += (n & b) > 0;
    res = max(res, cnt);
  }
  return res;
}