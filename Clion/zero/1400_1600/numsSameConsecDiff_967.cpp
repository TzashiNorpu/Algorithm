//
// Created by TzashiNorpu on 2023/6/20.
//
#include "../header/header.h"

using namespace zero;

vector<int> Solution::numsSameConsecDiff(int n, int k) {
  vector<int> cur = {1, 2, 3, 4, 5, 6, 7, 8, 9};
  for (int i = 2; i <= n; ++i) {
    vector<int> cur2;
    for (auto x: cur) {
      int y = x % 10;
      if (y + k < 10) cur2.push_back(x * 10 + y + k);
      // 不限定 y-k>=0 -> 在 n=2,k=7时 会在 x = 3 时生成 3*10=3-7=26的结果
      // 不限定 k>0 -> 在n=2,k=0时 会在 x=1 时生成两个 11【满足两个if】
      if (k > 0 && y - k >= 0) cur2.push_back(x * 10 + y - k);
    }
    cur = cur2;
  }
  return cur;
}