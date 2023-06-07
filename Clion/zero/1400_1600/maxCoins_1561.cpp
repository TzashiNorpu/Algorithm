//
// Created by TzashiNorpu on 2023/6/7.
//
#include "../header/header.h"

using namespace zero;

int Solution::maxCoins(vector<int> &piles) {
  std::sort(piles.begin(), piles.end());
  int mx = 0;
  int l = 0, r = piles.size() - 2;
  for (; l < r; l++, r -= 2) {
    mx += piles[r];
  }
  return mx;
}