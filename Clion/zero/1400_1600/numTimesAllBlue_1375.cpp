//
// Created by TzashiNorpu on 2023/6/21.
//
#include "../header/header.h"

using namespace zero;

int Solution::numTimesAllBlue(vector<int> &flips) {
  int right = 0, res = 0, n = flips.size();
  for (int i = 0; i < n; ++i) {
    // right == i+1 ： 当前迭代位置及以前的灯都点亮了
    // i+1:当前点亮了几盏灯
    // right：当前点亮的最右边的灯
    res += ((right = max(right, flips[i])) == i + 1);
  }
  return res;
}