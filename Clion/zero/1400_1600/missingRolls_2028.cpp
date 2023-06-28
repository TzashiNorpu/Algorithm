//
// Created by TzashiNorpu on 2023/6/28.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::missingRolls(vector<int> &rolls, int mean, int n) {
  int m = rolls.size();
  int remainSum = mean * (n + m) - std::accumulate(rolls.begin(), rolls.end(), 0);
  int remainAvg = remainSum / n;
  int remain = remainSum % n;
  if (remainSum < 0 || remainSum < n || remainAvg > 6 || (remainAvg == 6 && remain != 0)) return {};
  vector<int> res(n, remainAvg);
  // remain 一定小于 n
  for (int i = 0; i < remain; ++i) {
    res[i]++;
  }
  return res;
}