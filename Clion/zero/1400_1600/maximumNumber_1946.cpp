//
// Created by TzashiNorpu on 2023/6/28.
//
#include "../header/header.h"

using namespace zero;

string Solution::maximumNumber(string num, vector<int> &change) {
  int n = num.size();
  bool changed = false;
  for (int i = 0; i < n; ++i) {
    int d1 = num[i] - '0';
    int d2 = change[d1];
    if (d2 > d1) num[i] = d2 + '0', changed = true;
    else if (d1 == d2) continue;
    else {
      if (changed) break;
      continue;
    }
  }
  return num;
}